
package gen.anzeige;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AnzeigeWebservice", targetNamespace = "http://server/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AnzeigeWebservice {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://server/AnzeigeWebservice/addMessageRequest", output = "http://server/AnzeigeWebservice/addMessageResponse")
    public void addMessage(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/AnzeigeWebservice/delMessageRequest", output = "http://server/AnzeigeWebservice/delMessageResponse")
    public boolean delMessage(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @return
     *     returns gen.anzeige.StringArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/AnzeigeWebservice/getMessagesRequest", output = "http://server/AnzeigeWebservice/getMessagesResponse")
    public StringArray getMessages();

    /**
     * 
     * @param arg0
     * @return
     *     returns gen.anzeige.IntArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server/AnzeigeWebservice/collatzRequest", output = "http://server/AnzeigeWebservice/collatzResponse")
    public IntArray collatz(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @Action(input = "http://server/AnzeigeWebservice/removeMessageRequest", output = "http://server/AnzeigeWebservice/removeMessageResponse")
    public void removeMessage(
        @WebParam(name = "arg0", partName = "arg0")
        String arg0);

}
