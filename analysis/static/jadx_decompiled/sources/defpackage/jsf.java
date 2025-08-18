package defpackage;

import android.graphics.Path;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jsf extends ffe implements a66 {
    public final /* synthetic */ lsf X;
    public final /* synthetic */ byte[] Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsf(lsf lsfVar, Continuation continuation, byte[] bArr) {
        super(2, continuation);
        this.X = lsfVar;
        this.Y = bArr;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        jsf jsfVar = (jsf) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        jsfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new jsf(this.X, continuation, this.Y);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        r70 waveView = this.X.getWaveView();
        waveView.u0 = true;
        Path path = waveView.z0;
        if (!path.isEmpty()) {
            path.reset();
        }
        byte[] bArr = this.Y;
        if (bArr != null) {
            float measuredHeight = waveView.getMeasuredHeight() / 2.0f;
            path.reset();
            if (true ^ (bArr.length == 0)) {
                float width = waveView.getWidth();
                float f = waveView.o;
                float f2 = width - (f / 2.0f);
                int length = bArr.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i = length - 1;
                        float measuredHeight2 = (waveView.getMeasuredHeight() / 127.0f) * bArr[length];
                        float f3 = waveView.b;
                        if (measuredHeight2 < f3) {
                            measuredHeight2 = f3;
                        }
                        float f4 = measuredHeight2 / 2.0f;
                        path.moveTo(f2, measuredHeight - f4);
                        path.lineTo(f2, f4 + measuredHeight);
                        f2 = (f2 - f) - waveView.c;
                        if (i < 0) {
                            break;
                        }
                        length = i;
                    }
                }
            }
            waveView.invalidate();
        }
        return e5f.a;
    }
}
