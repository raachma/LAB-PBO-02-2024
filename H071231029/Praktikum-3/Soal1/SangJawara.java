 package Soal1;

class SangJawara {

    String nama;
    int HP;
    int AttackPower;
    int DefensePower;
    int LevelUp = 1;


    SangJawara(String nama, int HP, int AttackPower, int DefensePower,int LevelUp){

        this.nama = nama;
        this.HP = HP;
        this.AttackPower = AttackPower;
        this.DefensePower = DefensePower;
        this.LevelUp = LevelUp;

    }


    SangJawara(String nama, int HP, int AttackPower){
        this.nama = nama;
        this.HP = HP;
        this.AttackPower = AttackPower;


    }

    void MenerimaSerangan(SangJawara enemy){
        
        HP = enemy.getAttackPower() - DefensePower;
        
        System.out.println(SangJawara.this.nama + " Menerima damage " + enemy.nama + " Sebesar " + HP);
    }

    void LevelUp(){
       LevelUp++;
    }

    int MaXHealth(){
        return LevelUp * 5 + this.HP; 
    }

    public int getAttackPower() {
        return AttackPower;
    }


    void Show(){
        System.out.println("Level\t\t: " + LevelUp);
        System.out.println("Hero\t\t: " + nama );
        System.out.println("HP\t\t: " + MaXHealth() );
        System.out.println("AttackPower\t: " + AttackPower );
        System.out.println("DefensePower\t: " + DefensePower);
        System.out.println("");
    }


    

    
}