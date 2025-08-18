package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.webrtc.DataChannel;
import ru.ok.android.webrtc.protocol.exceptions.RtcInternalHandleException;

/* loaded from: classes2.dex */
public final class e24 {
    public final DataChannel a;
    public final a4c b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();

    public e24(DataChannel dataChannel, a4c a4cVar) {
        this.a = dataChannel;
        this.b = a4cVar;
        dataChannel.registerObserver(new imc(this, 14, dataChannel));
    }

    public final void a(uoc uocVar) {
        if (uocVar == null) {
            throw new IllegalArgumentException("Illegal 'listener' value: null");
        }
        this.d.add(uocVar);
    }

    public final boolean b() {
        return this.a.state() == DataChannel.State.OPEN;
    }

    public final void c(uoc uocVar) {
        if (uocVar == null) {
            throw new IllegalArgumentException("Illegal 'listener' value: null");
        }
        this.d.remove(uocVar);
    }

    public final void d(ByteBuffer... byteBufferArr) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            try {
                ((uoc) it.next()).getClass();
            } catch (Throwable th) {
                this.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.send", new RtcInternalHandleException(th));
            }
        }
        this.a.sendMultiple(true, byteBufferArr);
    }

    public final boolean e(int i, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Illegal 'command' value: null");
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            try {
                ((uoc) it.next()).getClass();
                ByteBuffer.wrap(bArr);
            } catch (Throwable th) {
                this.b.reportException("DataChannelRtcTransport", "rtc.datachannel.listen.send", new RtcInternalHandleException(th));
            }
        }
        return this.a.send(new DataChannel.Buffer(ByteBuffer.wrap(bArr), i == 2));
    }
}
