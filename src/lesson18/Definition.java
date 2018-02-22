package lesson18;

public class Definition {
    private void notifyUsers(String[] userEmails) {

        for (String email : userEmails) {
            //обработка ошибки
            try {
                //send email to user - error
                System.out.println("Email " + email + " was send");
//
                //
                //
            } catch (Exception e) {
                //how should i handle exception
                System.err.println("Email " + email + "wasn't send");
            }

            // ВЫПОЛНЯЕТСЯ В ЛЮБОМ СЛУЧАЕ ПОСЛЕ ОБРАБОТКИ try И catch
            finally {
                //updateStatus
            }
//       } catch (type2 e){
            //ДЛЯ ВТОРОГО ТИПА ОШИБКИ И ТАК ДАЛЕЕ
            //
            //
            //}
        }
        //1
        //2
        //3
    }
}