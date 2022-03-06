public class EggPackage {
  public static void main(String[] args) {
    int totalEggs = 277;
    int eggCartonSize = 30;
    int remainingEggs = totalEggs % eggCartonSize;
    System.out.println("총 " + remainingEggs + "개의 계란이 남습니다.");
  }
}
