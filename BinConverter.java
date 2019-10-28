public class BinConverter {
    public int toBinary(boolean[] bits){
        int result = 0;
        if (bits[7] == true){
            result+=1;
        }
        if (bits[6] == true){
            result+=2;
        }
        if (bits[5] == true){
            result+=4;
        }
        if (bits[4] == true){
            result+=8;
        }
        if (bits[3] == true){
            result+=16;
        }
        if (bits[2] == true){
            result+=32;
        }
        if (bits[1] == true){
            result+=64;
        }
        if (bits[0] == true){
            result+=128;
        }
        return result;
    }
}
