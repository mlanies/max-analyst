package defpackage;

/* loaded from: classes.dex */
public enum kkc {
    END(vzb.call_finished),
    INCOMING(vzb.call_incoming),
    BEEP(vzb.call_ringing),
    BUSY(vzb.call_busy),
    CONNECTING(vzb.call_connecting),
    CONNECTED(vzb.call_connected);

    public final int a;

    kkc(int i) {
        this.a = i;
    }
}
