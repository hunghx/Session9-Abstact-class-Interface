package ra.inter_face;

public interface ICrud {
    double PI =3.14;
    void create(int a);
    void update(int index,int b);
    void delete(int index);
    int getByIndex(int index);
    int[]  getArray();

   default void displayAll(){
       System.out.println("Đây là phương thức mặc định");
   };
   static void getOne(){

   }
}
