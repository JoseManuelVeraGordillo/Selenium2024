Feature:  Navigarion bar
    To see the subpages
    Whitout loggin in
    I can click the navigation bar links
    
   # Scenario: I can acces the subpages througt the navigation bar //este escenario es sin argmentos
   Scenario Outline: I can acces the subpages througt the navigation bar 
   #este escenario es para pasarle una tabla con diferentes argumentos
    Given I navigate to www.freerangetester.com
    When I go to a <section> using the navigation bar
#los argumentos de la
Examples:
    | section | 
    | Cursos  |
    | Recursos |
    | Blog | 
    | Mentorías  |
    | Udemy  |
    | Academia  |