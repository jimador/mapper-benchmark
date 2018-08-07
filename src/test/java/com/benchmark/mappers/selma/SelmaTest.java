package com.benchmark.mappers.selma;

import com.benchmark.mappers.BaseMapperTest;
import fr.xebia.extras.selma.Selma;

/**
 * @author James Dunnam
 * @since 12.1
 */
public class SelmaTest extends BaseMapperTest {
    public SelmaTest() {
        super(Selma.builder(EmployeeMapper.class).build());
    }
}
