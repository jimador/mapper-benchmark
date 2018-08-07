package com.benchmark.mappers.jmh;

import com.benchmark.mappers.mapstruct.EmployeeMapper;
import com.benchmark.mappers.model.Employee;
import com.benchmark.mappers.model.EmployeeFactory;
import com.benchmark.mappers.model.dto.EmployeeDto;
import com.benchmark.mappers.orika.OrikaMapper;
import fr.xebia.extras.selma.Selma;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.results.RunResult;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author James Dunnam
 */
@State(Scope.Benchmark)
public class MapperBenchmark {
    private final int nums = 20;
    private List<Employee> EMPLOYEES;
    private OrikaMapper orikaMapper;
    private com.benchmark.mappers.selma.EmployeeMapper selmaMapper;
    private com.benchmark.mappers.mapstruct.EmployeeMapper mapstructMapper;

    @Setup
    public void setup() {
        orikaMapper = new OrikaMapper();
        selmaMapper = Selma.builder(com.benchmark.mappers.selma.EmployeeMapper.class).build();
        mapstructMapper = EmployeeMapper.MAPPER;
        EMPLOYEES = EmployeeFactory.create(nums);
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void testOrika(Blackhole bh) {
        OrikaMapper orikaMapper1 = orikaMapper;
        for (Employee EMPLOYEE : EMPLOYEES) {
            bh.consume(orikaMapper1.map(EMPLOYEE));
        }

    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void testMapStruct(Blackhole bh) {
        for (Employee EMPLOYEE : EMPLOYEES) {
            bh.consume(mapstructMapper.map(EMPLOYEE));
        }
    }

    @Benchmark
    @OutputTimeUnit(TimeUnit.SECONDS)
    public void testSelma(Blackhole bh) {
        for (Employee EMPLOYEE : EMPLOYEES) {
            bh.consume(selmaMapper.map(EMPLOYEE));
        }
    }

    /**
     * To run this benchmark class:
     *
     * java -jar target/mapper-benchmark.jar
     *
     * @param args args
     * @throws RunnerException thrown by jhm
     */
    public static void main(String[] args) throws RunnerException {
        Options options = new OptionsBuilder()
                .include(MapperBenchmark.class.getSimpleName())
                .warmupIterations(2)
                .measurementIterations(10)
                .shouldDoGC(true)
                .forks(3)
                .resultFormat(ResultFormatType.TEXT)
                .build();

        Collection<RunResult> results = new Runner(options).run();
        results.stream()
                .map(RunResult::getPrimaryResult)
                .forEach(r -> System.out.println("Mapper benchmark score: "
                        + r.getScore() + " "
                        + r.getScoreUnit() + " over "
                        + r.getStatistics().getN() + " iterations"));
    }
}
