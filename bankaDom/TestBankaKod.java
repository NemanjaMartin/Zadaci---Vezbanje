package bankaDom;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBankaKod {

	@Test
	public void testKontruktor() {
		BankaKod bk1 = new BankaKod("intesa", "364-35667543-88");

		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(bk1.dohvatiIme(), "intesa");
		sa.assertEquals(bk1.dohvatiZiroRacun(), "364-35667543-88");
		sa.assertEquals(bk1.dohvatiIznos(), 0.0);

	}

	@Test
	public void TestGetSet() {

		String ime = "banka";
		String ziroRacun = "123";
		double stanje = 0;
		double stanje1 = 1000;
		BankaKod bk1 = new BankaKod(ime, ziroRacun);
		
        SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(bk1.dohvatiIme(), ime);
		sa.assertEquals(bk1.dohvatiZiroRacun(), ziroRacun);
		sa.assertEquals(bk1.dohvatiIznos(), 0.0);

	}
	
	@Test
	public void testStanjenaRacunu() {
		BankaKod bk1 = new BankaKod("intesa", "364-35667543-88");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(bk1.dohvatiIznos(), 0d);
		
	}
	
	

}
