
public class Fight
	{
		String name;
		int characterHealth;
		int firstAttackDamage;
		String firstAttack;
		String firstAttackHit;
		String firstAttackMiss;
		int firstAttackAccuracy;
		int secondAttackDamage;
		String secondAttack;
		String secondAttackHit;
		String secondAttackMiss;
		int secondAttackAccuracy;
		int thirdAttackDamage;
		String thirdAttack;
		String thirdAttackHit;
		String thirdAttackMiss;
		int thirdAttackAccuracy;
		int fourthAttackDamage;
		String fourthAttack;
		String fourthAttackHit;
		String fourthAttackMiss;
		int fourthAttackAccuracy;
		int specialAttackDamage;
		String specialAttack;
		double specialPercentage;
		boolean discovered;
		int maxHp;
	

public Fight(String fpn, int ch, int fad, String fa, String fah, String fam, int faaa, int sad, String sa, String sah, String sam, int saaa, int tad, String ta, String tah, String tam, int taaa,int fadd, String faa, String fahh, String famm, int faaaa, int sadd, String saa, double sp, boolean d, int mh)
{
name = fpn;
characterHealth = ch;
firstAttackDamage = fad;
firstAttack = fa;
firstAttackHit = fah;
firstAttackMiss = fam;
firstAttackAccuracy = faaa;
secondAttackDamage = sad;
secondAttack = sa;
secondAttackHit = sah;
secondAttackMiss = sam;
secondAttackAccuracy = saaa;
thirdAttackDamage = tad;
thirdAttack = ta;
thirdAttackHit = tah;
thirdAttackMiss = tam;
thirdAttackAccuracy = taaa;
fourthAttackDamage = fadd;
fourthAttack = faa;
fourthAttackHit = fahh;
fourthAttackMiss = famm;
fourthAttackAccuracy = faaaa;
specialAttackDamage = sadd;
specialAttack = saa;
specialPercentage = sp;
discovered = d;
maxHp = mh;
}


public int getMaxHp()
	{
		return maxHp;
	}


public void setMaxHp(int maxHp)
	{
		this.maxHp = maxHp;
	}


public boolean isDiscovered()
	{
		return discovered;
	}


public void setDiscovered(boolean discovered)
	{
		this.discovered = discovered;
	}


public String getFirstAttackHit()
	{
		return firstAttackHit;
	}


public void setFirstAttackHit(String firstAttackHit)
	{
		this.firstAttackHit = firstAttackHit;
	}


public String getFirstAttackMiss()
	{
		return firstAttackMiss;
	}


public void setFirstAttackMiss(String firstAttackMiss)
	{
		this.firstAttackMiss = firstAttackMiss;
	}


public int getFirstAttackAccuracy()
	{
		return firstAttackAccuracy;
	}


public void setFirstAttackAccuracy(int firstAttackAccuracy)
	{
		this.firstAttackAccuracy = firstAttackAccuracy;
	}


public String getSecondAttackHit()
	{
		return secondAttackHit;
	}


public void setSecondAttackHit(String secondAttackHit)
	{
		this.secondAttackHit = secondAttackHit;
	}


public String getSecondAttackMiss()
	{
		return secondAttackMiss;
	}


public void setSecondAttackMiss(String secondAttackMiss)
	{
		this.secondAttackMiss = secondAttackMiss;
	}


public int getSecondAttackAccuracy()
	{
		return secondAttackAccuracy;
	}


public void setSecondAttackAccuracy(int secondAttackAccuracy)
	{
		this.secondAttackAccuracy = secondAttackAccuracy;
	}


public String getThirdAttackHit()
	{
		return thirdAttackHit;
	}


public void setThirdAttackHit(String thirdAttackHit)
	{
		this.thirdAttackHit = thirdAttackHit;
	}


public String getThirdAttackMiss()
	{
		return thirdAttackMiss;
	}


public void setThirdAttackMiss(String thirdAttackMiss)
	{
		this.thirdAttackMiss = thirdAttackMiss;
	}


public int getThirdAttackAccuracy()
	{
		return thirdAttackAccuracy;
	}


public void setThirdAttackAccuracy(int thirdAttackAccuracy)
	{
		this.thirdAttackAccuracy = thirdAttackAccuracy;
	}


public String getFourthAttackHit()
	{
		return fourthAttackHit;
	}


public void setFourthAttackHit(String fourthAttackHit)
	{
		this.fourthAttackHit = fourthAttackHit;
	}


public String getFourthAttackMiss()
	{
		return fourthAttackMiss;
	}


public void setFourthAttackMiss(String fourthAttackMiss)
	{
		this.fourthAttackMiss = fourthAttackMiss;
	}


public int getFourthAttackAccuracy()
	{
		return fourthAttackAccuracy;
	}


public void setFourthAttackAccuracy(int fourthAttackAccuracy)
	{
		this.fourthAttackAccuracy = fourthAttackAccuracy;
	}


public String getName()
	{
		return name;
	}


public void setName(String name)
	{
		this.name = name;
	}


public int getCharacterHealth()
	{
		return characterHealth;
	}


public void setCharacterHealth(int characterHealth)
	{
		this.characterHealth = characterHealth;
	}


public int getFirstAttackDamage()
	{
		return firstAttackDamage;
	}


public void setFirstAttackDamage(int firstAttackDamage)
	{
		this.firstAttackDamage = firstAttackDamage;
	}


public String getFirstAttack()
	{
		return firstAttack;
	}


public void setFirstAttack(String firstAttack)
	{
		this.firstAttack = firstAttack;
	}


public int getSecondAttackDamage()
	{
		return secondAttackDamage;
	}


public void setSecondAttackDamage(int secondAttackDamage)
	{
		this.secondAttackDamage = secondAttackDamage;
	}


public String getSecondAttack()
	{
		return secondAttack;
	}


public void setSecondAttack(String secondAttack)
	{
		this.secondAttack = secondAttack;
	}


public int getThirdAttackDamage()
	{
		return thirdAttackDamage;
	}


public void setThirdAttackDamage(int thirdAttackDamage)
	{
		this.thirdAttackDamage = thirdAttackDamage;
	}


public String getThirdAttack()
	{
		return thirdAttack;
	}


public void setThirdAttack(String thirdAttack)
	{
		this.thirdAttack = thirdAttack;
	}


public int getFourthAttackDamage()
	{
		return fourthAttackDamage;
	}


public void setFourthAttackDamage(int fourthAttackDamage)
	{
		this.fourthAttackDamage = fourthAttackDamage;
	}


public String getFourthAttack()
	{
		return fourthAttack;
	}


public void setFourthAttack(String fourthAttack)
	{
		this.fourthAttack = fourthAttack;
	}


public int getSpecialAttackDamage()
	{
		return specialAttackDamage;
	}


public void setSpecialAttackDamage(int specialAttackDamage)
	{
		this.specialAttackDamage = specialAttackDamage;
	}


public String getSpecialAttack()
	{
		return specialAttack;
	}


public void setSpecialAttack(String specialAttack)
	{
		this.specialAttack = specialAttack;
	}


public double getSpecialPercentage()
	{
		return specialPercentage;
	}


public void setSpecialPercentage(double specialPercentage)
	{
		this.specialPercentage = specialPercentage;
	}
}