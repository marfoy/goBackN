package reso.examples.goBackN;

import reso.common.Host;
import reso.examples.pingpong.PingPongProtocol;
import reso.ip.IPAddress;
import reso.ip.IPHost;
import reso.ip.IPLayer;

/**
 * Created by 141197 on 6/05/15.
 */
public class PacketSender {
    private final Host host;
    private final IPLayer ip;
    private final IPAddress dst;
    private final int data;

    public PacketSender(IPHost host, IPAddress dst, int num) {
        this.host = host;
        this.ip = host.getIPLayer();
        this.dst = dst;
        this.data = num;
    }



    public void start()
            throws Exception {
        this.ip.addListener(PingPongProtocol.IP_PROTO_PINGPONG, new PingPongProtocol((IPHost) host));
        this.ip.send(IPAddress.ANY, dst, PingPongProtocol.IP_PROTO_PINGPONG, new Packet(data));
    }

    public void stop() {}
}
