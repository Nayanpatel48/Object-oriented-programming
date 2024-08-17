public static void main(String[] args)
{
    //finding 12 in a two-dimensional array

    //labeled break
//    label:
//    for (initialization; condition; increment) {
//        // code
//        if (condition) {
//            break label; // breaks out of the labeled loop
//        }
//    }

    //-----------------------------normal approach---------------------------------------
    int[][] array = {
            {2,3,4,5,6,7},
            {8,9,10,11,2,12},
            {0,0,0,0,0,0}
    };
    boolean elementFound = false;

    for (int[] row : array)
    {
        for (int ele : row)
        {
            if (ele == 12) {
                elementFound=true;
                break;
            }
        }
    }

    if (elementFound)
        System.out.println("12 is there.");
    else
        System.out.println("12 is missing.");
    elementFound=false;

    //-----------------------------------labeled break----------------------------------------

    //there should not be any statements in between label and outer loop as shown belo
    //if it was like ex1 then it won't work

    //ex1:
    // search:
    // System.out.println();
    //    for (int[] row : array)
    //    {
    //        for (int ele : row)
    //        {
    //            if (ele == 12) {
    //                elementFound=true;
    //                break search;
    //            }
    //        }
    //    }
    search:
    for (int[] row : array)
    {
        for (int ele : row)
        {
            if (ele == 12) {
                elementFound=true;
                break search;
            }
        }
    }
    if (elementFound)
        System.out.println("12 is there.");
    else
        System.out.println("12 is missing.");
    elementFound=false;

    //----------------------three dimensional array label break---------------------------
    int[][][] newArray = {
            {{2,3},{4,5},{6,7}},
            {{8,9},{10,11},{2,12}},
            {{0,0},{0,0},{0,0}}
    };

    label1:
    for (int[][] row : newArray)
    {
        label2:
        for (int[] ele : row)
        {
            for (int innerEle : ele)
            {
                if (innerEle == 12) {
                    elementFound=true;
                    break label1;
                }
            }
        }
    }
    if (elementFound)
        System.out.println("12 is there.");
    else
        System.out.println("12 is missing.");
    //it doesn't make me more sence
}