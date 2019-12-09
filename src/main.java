import static java.lang.Math.pow;

public class main {
    public static void main(String[] args){
        double dt = 0.1;
        double[] T = new double[50];
        for(int n = 0; n < 50; n++)
        {
            T[n] = dt * n;
        }
        double[] x = new double[51];
        x[0] = 1;
        double kx1;
        double kx2;
        double kx3;
        double kx4;
        //giant for loop for each iteration
        for(int i = 0; i < 50; i++){
            kx1 = (pow(T[i],2) + pow(Math.E, -1*x[i])) * dt;
            kx2 = (pow(T[i] + 0.5*dt, 2) + pow(Math.E, -1 * (x[i] + 0.5*kx1))) * dt;
            kx3 = (pow(T[i] + 0.5*dt, 2) + pow(Math.E, -1 * (x[i] + 0.5*kx2))) * dt;
            kx4 = (pow(T[i] + dt, 2) + pow(Math.E, -1 * (x[i] + kx3))) * dt;
            x[i+1] = x[i] + (kx1/6.0) + (kx2/3.0) + (kx3/3.0) + (kx4/6.0);
        }

        for(int i = 0; i < 51; i++)
        {
            System.out.println(x[i]);
        }
    }
}
