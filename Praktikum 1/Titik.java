public class Titik {
    double absis;
    double ordinat;
    static int counterTitik;

    Titik() {
        counterTitik = counterTitik+1;
    }

    Titik(float a, float o) {
        absis = a;
        ordinat = o;
        counterTitik = counterTitik+1;
    }

    void setAbsis(double a) {
        absis = a;
    }

    void setOrdinat(double o) {
        ordinat = o;
    }

    double getAbsis() {
        return absis;
    }

    double getOrdinat() {
        return ordinat;
    }

    static int getCounterTitik() {
        return counterTitik;
    }

}