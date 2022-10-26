import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLCon {

    private final String USER_AGENT = "Mozilla/5.0";
    
    // userà il browser Mozzilla

    public static void main(String[] args) throws Exception {

        HttpURLCon http = new HttpURLCon();
        
        // oggetto httpUrlConnection

        System.out.println("Sending HTTP GET request");
        
        // metodo che manda la richiesta al server
        http.sendGet();

    }

    private void sendGet() throws Exception {
        // specifichiamo la url
        String url = "https://www.google.com";
        //La stringa url viene passata come parametro all'oggetto URL
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        //Request header
        con.setRequestProperty("User-Agent", USER_AGENT);
        // respondeCode ci indica se la request è andata a buon fine 
        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);
        
        // BufferReader e InputReader sono degli oggetti che leggono dati in input e li portano
        // all'interno del nostro programma
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        System.out.println(response.toString());
    }}
