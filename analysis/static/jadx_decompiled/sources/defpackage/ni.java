package defpackage;

import android.graphics.Color;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class ni implements uoc {
    public final bg4 a;
    public final kad b;
    public e24 c;

    public ni(bg4 bg4Var, kad kadVar) {
        this.a = bg4Var;
        this.b = kadVar;
    }

    @Override // defpackage.uoc
    public final void a(e24 e24Var, byte[] bArr, int i) {
        SystemClock.elapsedRealtime();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byte b = byteBufferWrap.get();
        byteBufferWrap.getShort();
        byteBufferWrap.getInt();
        if (b == 1) {
            byteBufferWrap.getShort();
        } else {
            byteBufferWrap.getInt();
        }
        byte b2 = byteBufferWrap.get();
        ByteBuffer byteBufferSlice = byteBufferWrap.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        int i2 = 0;
        if (b == 1) {
            int iRemaining = byteBufferSlice.remaining() / 4;
            float[] fArr = new float[iRemaining];
            while (i2 < iRemaining) {
                fArr[i2] = byteBufferSlice.getFloat();
                i2++;
            }
        } else if (b2 == 0) {
            int iRemaining2 = byteBufferSlice.remaining();
            float[] fArr2 = new float[iRemaining2];
            while (i2 < iRemaining2) {
                fArr2[i2] = (byteBufferSlice.get() & 255) * 0.003921569f;
                i2++;
            }
        } else if (b2 != 1 && b2 == 2) {
            Color.rgb(byteBufferSlice.get() & 255, byteBufferSlice.get() & 255, byteBufferSlice.get() & 255);
        }
        kad kadVar = this.b;
        ((AtomicInteger) kadVar.Y).incrementAndGet();
        ((AtomicInteger) kadVar.X).addAndGet(bArr.length);
        this.a.getClass();
    }
}
