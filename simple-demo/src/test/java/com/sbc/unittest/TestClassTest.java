package com.sbc.unittest;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @ClassName TestClassTest
 * @Description powermock 测试类
 * @Author songbaicheng
 * @Date 2023/8/14 12:09
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({TestClass.class, UUID.class})
class TestClassTest {

    @Test
    public void testGetUUID() throws Exception {

        PowerMockito.mockStatic(UUID.class);
        PowerMockito.doReturn(new UUID(0L, 0L)).when(UUID.randomUUID());

        TestClass testClass = new TestClass();
        String uuid = testClass.getUUID();

//        PowerMockito.verifyStatic(UUID.class);

        assertEquals("00000000-0000-0000-0000-000000000000", uuid);
    }

    @Test
    public void testSoutArray() {
        TestClass testClass = PowerMockito.spy(new TestClass());

        List mockIntegers = PowerMockito.mock(List.class);
        PowerMockito.doReturn(mockIntegers).when(testClass).soutArray();

        testClass.soutArray();
    }
}