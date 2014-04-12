Organ transplantation
===============


# Organ Transplantation project #

## Description ##
 В даному проекті користувачем буде виступати лікар. Він зможе після  авторизації  вибрати орган пацієнту із певного списку для трансплантації і відповідно записати цього пацієнта на день  операції. Якщо цього органа немає, то пацієнт стає в чергу за цим органом. Якщо їх багато , то пацієнт має вказати в якому грошову діапазоні має бути його орган. 
 Пацієнту також необхідно знати наскільки орган ,який йому будуть пересаджувати, буде  давати ризик відторгнення. Цей ризик буде розраховуватись за спеціальним інтегральним коефіцієнтом, який буде змінюватись виходячи із аналізів пацієнтів( Група крові, HLA, стать та інші). 
 Також, якщо для пацієнта з’явився «кращий» орган або взагалі він з’явився, буде передбачено поява повідомлення для лікаря. Через нього лікар може змінити вибір органу , якщо він буде відповідно «кращим» і відповідно лежати в тому грошовому діапазоні , який необхідний пацієнту. 
 За бажанням лікар може відсортувати органи по різним критеріям (HLA, група крові, вік і т.д.) для пошуку більш здоровішого органа.
 Окремо буде розрахований інтегральний коефіцієнт на основі аналізів. Лікар може змінити деякі параметри критеріїв і, відповідн інтегральний коефіцієнт буде змінюватись. Він буде винесений в окрему табличку, щоб можна було змінювати значення різних критеріїв. 
 Проект буде зроблений на прикладі 3-х органів  - печінка, серце, нирки. 


## Authors ##
This section shoud contain list of project's authors as follows:

1. Лимар Борис
2. Богдан Калинюк
3. Цибульняк Катерина


# UML-diagram #

[UML] http://cs607131.vk.me/v607131273/6c4b/YPMCHAI2VNg.jpg
 
#Code#

import java.util.Vector;

public class Analyzes extends Organs {
    public Vector  myOrgans;
}

public class Coefficient extends Analyzes {

}

public class Doctor {

    public Vector  myOperations;
    public Vector  myOperations;

 }

public class Heart extends Organs {
}

public class Kidneys extends Organs {
}

public class Liver extends Organs {
}

public class Message {

    public Vector  myQueue;

}

public class Operations extends Queue {

    public Vector  myPatient;
    public Vector  myDoctor;
    public Vector  myDoctor;

}

public class Organs {

    public Vector  my;
    public Vector  myAnalyzes;

}

public class Patient {

    public Vector  myQueue of organs;
    public Vector  myQueue of organs;
    public Vector  myOperations;

}

public class Queue of organs extends Queue, Organs {

    public Vector  myPatient;
    public Vector  myPatient;

}

public class Queue {

    public Vector  myMessage;

}
