
public class labeldloop {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=4;j++) {
//				if(i==2) {
//					break;
//				}
//				System.out.println("i: " + i +"  j: "+ j);
//			}
//			System.out.println();
//			}
//		}
//
//	}
        outerloop:
        for (int i = 1; i <= 3; i++) {
            innerloop:
            for (int j = 1; j <= 4; j++) {
                if (i == 2) {
                    break outerloop;
                }
                System.out.println("i: " + i + "  j: " + j);
            }
            System.out.println();
        }
    }

}
