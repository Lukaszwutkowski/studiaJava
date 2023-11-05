package wyklad5;

//Ten interfejs jest po to aby moc drukowac umowy nie tylko na projekty, ale rowniez na sprzedaz lub uslugi
//Ten interfejs jest po to zeby w klasie umowa dzialala funkcja DrukujUmowe() nie tylko na projekcie
//Poniewaz funkcja DrukujUmowe() w Klasie Umowa uzywa funkcji Dane() i Wycena(), to interfejs musi miec te funkcje
//Wszystkie obiekty klas, ktore beda implementowaly po IObiektDoUmowy (dziedziczyly) i beda mialy funkcje --
// -- Dane() i Wycena() beda mogly korzystac z funkcji DrukujUmowe()
public interface IObiektDoUmowy {

    void Dane();

    double Wycena();
}
