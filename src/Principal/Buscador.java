package Principal;

import Modelos.Titulo;
import Modelos.TituloAPI;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Buscador {
    public static void main (String[] args) throws Exception {

        Scanner i = new Scanner ( System.in );

        System.out.println ("Digite o filme que deseja buscar: ");
        String recebeBusca = i.nextLine ();

        try{
            // Codificar o nome para um formato seguro de URL (trocar ' ' por '+')
            String buscaCodificada = URLEncoder.encode(recebeBusca, StandardCharsets.UTF_8);

            // PASSO 3: Montar a URL final com o nome já tratado
            String buscar = "http://www.omdbapi.com/?t=" + buscaCodificada + "&apikey=42ffb2a8";

            //criar um client HTTP
            HttpClient client = HttpClient.newHttpClient ();

            //Fazer a conexão com a API
            String url = buscar;

            //criando a requisição
            HttpRequest request = HttpRequest.newBuilder ()
                    .uri ( URI.create (url))
                    .GET ()     // metodo http
                    .build ();

            //Enviar a requisição e receber a resposta
            HttpResponse<String> response = client.send (
                    request,
                    HttpResponse.BodyHandlers.ofString()
            );

            //Processar a resposta
            System.out.println ("Status code: "+response.statusCode ());

            String recebeJson = response.body ();
            System.out.println ("Resposta: "+recebeJson);

            //criando um padrão de nomeclatura para receber o JSON
            Gson gson = new GsonBuilder ()
                    .setFieldNamingPolicy( FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloAPI tituloAPI = gson.fromJson ( recebeJson, TituloAPI.class );
            System.out.println (tituloAPI);

            Titulo meuTitulo = new Titulo (tituloAPI);
            System.out.println ("Titulo Já convertido: ");
            System.out.println (meuTitulo);

        } catch ( Exception e){
            System.out.println ("Ocorreu um erro ao preparar a busca: "+ e.getMessage ());
        }
        i.close ();
    }
}
