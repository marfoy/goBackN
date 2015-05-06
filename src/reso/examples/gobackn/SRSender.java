package reso.examples.gobackn;

/**
 * Created by florentdelgrange on 29/04/15.
 */
public class SRSender {

    int sendBase;
    int nextSeqNum;

    public void rdtSend(int data){
        if (nextSeqNum < sendBase + N) {
            pkt = make_pkt(next_seq_num, data, checksum);
            window[nextSeqNum] = pkt;
            udt_send(pkt);
            if (sendBase == nextSeqNum)
                start_timer();
            nextSeqNum++;

        }
        else
            refuse data;
    }

}
