package StructuralPatterns.Proxy;

/**
 * @program: DesignPattern
 * @description:
 * @author: chenlonghzen
 * @create: 2021-02-12 22:04
 **/
public interface  IHttp {
    void request(String sendData);

    void onSuccess(String receivedData);
}
