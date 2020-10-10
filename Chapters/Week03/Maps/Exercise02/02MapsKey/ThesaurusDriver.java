public class ThesaurusDriver
{
	public static void main(String[] args)
	{
		Thesaurus t = new Thesaurus();
		
		t.addWord("rapid");
		t.addWord("slow");
		System.out.println(t);
		t.addSynonym("rapid", "fast");
		t.addSynonym("rapid", "quick");
		t.addSynonym("rapid", "swift");
		t.addSynonym("slow", "leisurely");
		t.addSynonym("slow", "sluggish");
		System.out.println(t);
		System.out.println(t.getSynonyms("rapid"));
		t.addSynonym("fun", "enjoyable");
		System.out.println(t);
	}
}
/**
{rapid=[], slow=[]}
{rapid=[fast, quick, swift], slow=[leisurely, sluggish]}
[fast, quick, swift]
{fun=[enjoyable], rapid=[fast, quick, swift], slow=[leisurely, sluggish]}
*/