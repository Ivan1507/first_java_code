import java.util.*;
class Mandelbrot
{
    static int BAILOUT = 16; // Данная переменная помогает определить вхождение точки в определённый диапазон
    static int MAX_ITERATIONS=10000; //100,1000,10000,10000,10000
    static double pr=10; //1,2,4,5,8,10
    static int pr1=10;

	    /*Здесь начинается работа с формулами по множеству Мандельброта. В общем виде рекуррентное соотношение выглядит как Z(n+1)=Z(n)^2+C,
	    где n+1 и n - это порядковые номера Z, натуральные числа, а Z и C - комплексные числа вида R+I*i, где R - координата по ОХ, I - координата по ОУ, а i - мнимая единица.
	    По условию Z(0) = 0, следовательно, а все следующие Z рассчитываются по формулам zr = x(n+1) = x(n)^2 - y(n)^2 + x(0); zi = y(n+1) = 2*x(n)*y(n) + y(0),
	    где х(0) = cr, y(0) = ci. Также условием того, что С ясвляется подходящим числом, является вхождение координат этого числа в следующий диапазон:
	    х принадлежит (-2,2), у принадлежит (-2,2). Так как модуль комплексного числа есть его расстояние от начала координат, то из ограничения диапазона следует,
	    что модуль числа С не может превышать 4, а квадрат этого расстояния, соответственно не может превышать 16. Именно на основе этих условий, рассуждений и ограничений
	    реализован iterate */
	  public static void Max_it(int i) {
		  System.out.println("Выберите MAX_ITERATIONS из списка: ");
		    System.out.println("1. 100");
		    System.out.println("2. 1000");
		    System.out.println("3. 10000");
		    System.out.println("4. 100000");
		  switch (i) {
		    case 1:
		      MAX_ITERATIONS = 100;
		      break;
		    case 2:
		      MAX_ITERATIONS = 1000;
		      break;
		    case 3:
		      MAX_ITERATIONS = 10000;
		      break;
		    case 4:
		      MAX_ITERATIONS = 100000;
		      break;
		    default:
		      System.out.println("Такого варианта нет");
		  }
		}

		public static void Presize(int i) {
			System.out.println("Выберите Presize из списка: ");
		    System.out.println("1. 1");
		    System.out.println("2. 2");
		    System.out.println("3. 4");
		    System.out.println("4. 5");
		    System.out.println("5. 8");
		    System.out.println("6. 10");
		  switch (i) {
		    case 1:
		      pr = 1;
		      pr1 = 1;
		      break;
		    case 2:
		      pr = 2;
		      pr1 = 2;
		      break;
		    case 3:
		      pr = 4;
		      pr1 = 4;
		      break;
		    case 4:
		      pr = 5;
		      pr1 = 5;
		      break;
		    case 5:
		      pr = 8;
		      pr1 = 8;
		      break;
		    case 6:
		      pr = 10;
		      pr1 = 10;
		      break;
		    default:
		      System.out.println("Такого варианта нет");
		  }
		}
    private static int iterate(float x, float y) //Метод для определения, входит ли комплексное число (С) в множество Мандельброта
    {
        float cr = y-0.5f;
        float ci = x;
        float zi = 0.0f;
        float zr = 0.0f;
        int i = 0;
        while (true) {
            i++;
            float temp = zr * zi;
            float zr2 = zr * zr;
            float zi2 = zi * zi;
            zr = zr2 - zi2 + cr;
            zi = temp + temp + ci;
            if (zi2 + zr2 > BAILOUT)
                return i; // В случае выполнения условия (zi2 + zr2 > BAILOUT) С не является подходящим числом, программа отмечает это значением i, а в последствии выводит пробел
            if (i > MAX_ITERATIONS)
                return 0; // Аналогично объяснению из предыдущего комментария, в этом случае С считается подходящим, а программа в последствии выводит Звёздочку
        }
    }
    public static void main(String args[]) {
	    	/*Scanner scanner = new Scanner(System.in);
	        Max_it(scanner.nextInt());
	        Presize(scanner.nextInt());*/
        System.out.println("Hello world");
        int x,y,i,j,k;
        double[] t=new double [6400]; //Это время, затраченное программой, на расчет каждого отдельного числа С
        //int[] a= new int [6400];//Значения 1 и 0, где 1 - это число С входит в множество, а 0 - нет
        double[] m = new double [6400/pr1]; //Промежуточный массив, в котором записана сумма времени за каждые пресайз
        //int[] l = new int [6400/pr1]; //Промежуточная сумма значений из массива а, тоже за каждый пресайз
        int s = pr1*pr1;
        double[] n=new double [6400/s]; //Конечная сумма времени
        //int[] b= new int [6400/s];
        k=0;
        for (y=0; y<80;y++) {
            Date d1 = new Date(); //Время начала вычисления
            //Подобные значения для у и для х определены исходя из размеров квадрата - 80x80
            //System.out.print("\n");
            for (x=0;x<80;x++) {
                if (iterate((x-39)/40.0f,(y-39)/40.0f) == 0) {
                    Date d2 = new Date(); //Время конца вычисления
                    t[k] = d2.getTime() - d1.getTime(); //Время вычисления
                    //System.out.print(t[k]/100.0f + " " + k + "\n");
                    //a[k]=1;
                    k=k+1;
                }
                else {
                    Date d2 = new Date(); //Время конца вычисления
                    t[k] = d2.getTime() - d1.getTime(); //Время вычисления
                    //System.out.print(t[k]/100.0f + " " + k + "\n");
                    //a[k]=0;
                    k=k+1;
                }
            }
        }
        for (k=0;k<6400;k=k+80) {
            for (i=k;i<k+80;i=i+pr1) {
                for (j=i;j<i+pr;j++) {
                    //l[i/pr1]=l[i/pr1]+a[j];
                    m[i/pr1]=m[i/pr1]+t[j]; //Добавлено время
                }
            }
        }
        for (k=0;k<6400/pr;k=k+80) {
            for (j=k/pr1;j<(k+80)/pr;j++) {
                for (i=k+j-k/pr1;i<k+80;i=i+80/pr1) {
                    //b[j]=b[j]+l[i];
                    n[j]=n[j]+m[i]; //Добавлено время
                }
                double p = pr*pr;
                n[j]=n[j]/p;
                System.out.print(n[j] + "  ");
            }
            System.out.print("\n");
        }
    }
}
