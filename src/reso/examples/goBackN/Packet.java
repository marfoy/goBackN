package reso.examples.goBackN;

import reso.common.Message;

/**
 * Created by 141197 on 6/05/15.
 */
public class Packet implements Message {

    int seqNbr;

    int data;

    public Packet(int data) {
    }

    @Override
    public int getByteLength() {
        return data;
    }
}
