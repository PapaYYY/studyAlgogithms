package com.codility;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void binaryGapTest(){
        BinaryGap bg = new BinaryGap();
        Assert.assertEquals(bg.solution(9), 2);
        Assert.assertEquals(bg.solution(529), 4);
        Assert.assertEquals(bg.solution(20), 1);
        Assert.assertEquals(bg.solution(15), 0);
        Assert.assertEquals(bg.solution(32), 0);
        Assert.assertEquals(bg.solution(1041), 5);
    }

    @Test(dataProvider = "oddOccurrenncesInArray")
    public void oddOccurrenncesInArray02Test(int[] array, int result){
        OddOccurrencesInArray02 ooInArr = new OddOccurrencesInArray02();
        Assert.assertEquals(ooInArr.solution(array), result);
    }

    @Test(dataProvider = "cyclicRotation")
    public void cyclicRotationTest(int[] array, int rotationNumber, int[] result){
        CyclicRotation02 cr = new CyclicRotation02();
        Assert.assertEquals(cr.solution(array, rotationNumber), result);
    }

    @DataProvider(name="oddOccurrenncesInArray")
    public Object[][] oddOccurrenncesInArray(){
        return new Object[][]{
                {
                    new int[]{9, 3 , 9, 3, 9, 7, 9},
                        7
                },
                {
                    new int[]{1, 2 , 2, 4, 5, 4, 5},
                        1
                }
        };
    }

    @DataProvider(name="cyclicRotation")
    public Object[][] cyclicRotation(){
        return new Object[][]{
                {
                        new int[]{3, 8 , 9, 7, 6},
                        1,
                        new int[]{6, 3 , 8, 9, 7}
                },
                {
                        new int[]{3, 8 , 9, 7, 6},
                        3,
                        new int[]{9, 7 , 6, 3, 8}
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

}
