package com.codility;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class MainTest {

    @Test
    public void binaryGapTest() {
        BinaryGap bg = new BinaryGap();
        Assert.assertEquals(bg.solution(9), 2);
        Assert.assertEquals(bg.solution(529), 4);
        Assert.assertEquals(bg.solution(20), 1);
        Assert.assertEquals(bg.solution(15), 0);
        Assert.assertEquals(bg.solution(32), 0);
        Assert.assertEquals(bg.solution(1041), 5);
    }

    @Test(dataProvider = "oddOccurrenncesInArray")
    public void oddOccurrenncesInArray02Test(int[] array, int result) {
        OddOccurrencesInArray02 ooInArr = new OddOccurrencesInArray02();
        Assert.assertEquals(ooInArr.solution(array), result);
    }

    @Test(dataProvider = "cyclicRotation")
    public void cyclicRotationTest(int[] array, int rotationNumber, int[] result) {
        CyclicRotation02 cr = new CyclicRotation02();
        Assert.assertEquals(cr.solution(array, rotationNumber), result);
    }

    @Test
    public void frogJumpTest() {
        FrogJump03 fj = new FrogJump03();
        Assert.assertEquals(fj.solution(10, 85, 30), 3);
        Assert.assertEquals(fj.solution(1, 10, 5), 2);
        Assert.assertEquals(fj.solution(2, 8, 2), 3);
    }

    @Test(dataProvider = "permMissingElem")
    public void permMissingElemTets(int[] A, int result) {
        PermMissingElem03 pme = new PermMissingElem03();
        Assert.assertEquals(pme.solution(A), result);
    }

    @Test(dataProvider = "tapeEquilibrium")
    public void tapeEquilibriumTest(int[] A, int result) {
        TapeEquilibrium03 te = new TapeEquilibrium03();
        Assert.assertEquals(te.solution(A), result);
    }

    @Test(dataProvider = "permCheck")
    public void permCheckTest(int[] A, int result) {
        PermCheck04 pch = new PermCheck04();
        Assert.assertEquals(pch.solution(A), result);
    }

    @Test(dataProvider = "frogRiverOne")
    public void frogRiverOneTest(int[] A, int length, int result) {
        FrogRiverOne04 fro = new FrogRiverOne04();
        Assert.assertEquals(fro.solution(length, A), result);
    }

    @Test(dataProvider = "maxCounters")
    public void maxCountersTest(int[] A, int N, int[] result) {
        MaxCounters04 mc = new MaxCounters04();
        Assert.assertTrue(Arrays.equals(mc.solution(N, A), result));
    }

    @DataProvider(name = "oddOccurrenncesInArray")
    public Object[][] oddOccurrenncesInArray() {
        return new Object[][]{
                {
                        new int[]{9, 3, 9, 3, 9, 7, 9},
                        7
                },
                {
                        new int[]{1, 2, 2, 4, 5, 4, 5},
                        1
                }
        };
    }

    @DataProvider(name = "cyclicRotation")
    public Object[][] cyclicRotation() {
        return new Object[][]{
                {
                        new int[]{3, 8, 9, 7, 6},
                        1,
                        new int[]{6, 3, 8, 9, 7}
                },
                {
                        new int[]{3, 8, 9, 7, 6},
                        3,
                        new int[]{9, 7, 6, 3, 8}
                },
                {
                        new int[]{0, 0, 0},
                        1,
                        new int[]{0, 0, 0},
                },
                {
                        new int[]{1, 2, 3, 4},
                        4,
                        new int[]{1, 2, 3, 4},
                }
        };
    }

    @DataProvider(name = "permMissingElem")
    public Object[][] permMissingElem() {
        return new Object[][]{
                {
                        new int[]{2, 3, 1, 5},
                        4
                },
                {
                        new int[]{2, 3, 4, 5, 6},
                        1
                },
                {
                        new int[]{1, 2, 3, 4, 5},
                        6
                }
        };
    }

    @DataProvider(name = "tapeEquilibrium")
    public Object[][] tapeEquilibrium() {
        return new Object[][]{
                {
                        new int[]{3, 1, 2, 4, 3},
                        1
                },
                {
                        new int[]{-3, 1, -2},
                        0
                },
                {
                        new int[]{1, 2},
                        1
                },
        };
    }

    @DataProvider(name = "permCheck")
    public Object[][] permCheck() {
        return new Object[][]{
                {
                        new int[]{4, 1, 3, 2},
                        1
                },
                {
                        new int[]{4, 1, 3},
                        0
                },
        };
    }

    @DataProvider(name = "frogRiverOne")
    public Object[][] frogRiverOne() {
        return new Object[][]{
                {
                        new int[]{1, 3, 1, 4, 2, 3, 5, 4},
                        5,
                        6
                },
                {
                        new int[]{1, 3, 1, 4, 2, 3, 1, 4},
                        5,
                        -1
                }
        };
    }

    @DataProvider(name = "maxCounters")
    public Object[][] maxCounters() {
        return new Object[][]{
                {
                        new int[]{3, 4, 4, 6, 1, 4, 4},
                        5,
                        new int[]{3, 2, 2, 4, 2},
                },
        };
    }

}
