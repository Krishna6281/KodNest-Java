
class nestedloop {

    // public static void main(String[] args) {
    //     int i = 1;
    //     while (i <= 5) {
    //         int j = 1;
    //         while (j <= 5) {
    //             System.out.println(j);
    //             j++;
    //         }
    //         System.out.println();
    //         i++;
    //     }
    // }
// public static void main (String [] args)
// {
//     for(int i=1;i<=5;i++){ 
//         for(int j=1;j<=5;j++){
//             System.out.println(j);
//         }
//         System.out.println();
//     }
// }}
    public static void main(String[] args) {
        int i = 1;
        do {
            int j = 1;
            do {
                System.out.println(j);
                j++;
            } while (j <= 5);
            System.out.println();
            i++;
        } while (i <= 5);
    }

}
