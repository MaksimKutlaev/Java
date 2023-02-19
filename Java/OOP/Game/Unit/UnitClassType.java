package Game.Unit;

public enum UnitClassType{
    Magican ("Маг     "),
   Monk ("Монах"),
   Peasant ("Крестьянин"),
   Rogue ("Разбойник"),
   Sniper ("Снайпер"),
   Xbowman ("Арбалетчик"),
   Spearman ("Копейщик");

   private String title;

   UnitClassType(String title) {
       this.title = title;
   }

   public String getTitle() {
       return title;
   }
}

