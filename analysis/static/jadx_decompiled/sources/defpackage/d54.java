package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class d54 {
    public static final LinkedHashMap a;

    static {
        jn jnVarA = cx6.a();
        jnVarA.I("AssetLoader", zw6.o("InputFormat", "OutputFormat"));
        Object[] objArr = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        c54.n(6, objArr);
        jnVarA.I("AudioDecoder", zw6.h(6, objArr));
        jnVarA.I("AudioGraph", zw6.o("RegisterNewInputStream", "OutputEnded"));
        Object[] objArr2 = {"RegisterNewInputStream", "OutputFormat", "ProducedOutput"};
        c54.n(3, objArr2);
        jnVarA.I("AudioMixer", zw6.h(3, objArr2));
        Object[] objArr3 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        c54.n(6, objArr3);
        jnVarA.I("AudioEncoder", zw6.h(6, objArr3));
        Object[] objArr4 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        c54.n(6, objArr4);
        jnVarA.I("VideoDecoder", zw6.h(6, objArr4));
        Object[] objArr5 = {"RegisterNewInputStream", "SurfaceTextureInput", "QueueFrame", "QueueBitmap", "QueueTexture", "RenderedToOutputSurface", "OutputTextureRendered", "ReceiveEndOfAllInput", "SignalEnded"};
        c54.n(9, objArr5);
        jnVarA.I("VFP", zw6.h(9, objArr5));
        jnVarA.I("ExternalTextureManager", zw6.o("SignalEOS", "SurfaceTextureTransformFix"));
        jnVarA.I("BitmapTextureManager", zw6.n("SignalEOS"));
        jnVarA.I("TexIdTextureManager", zw6.n("SignalEOS"));
        jnVarA.I("Compositor", zw6.n("OutputTextureRendered"));
        Object[] objArr6 = {"InputFormat", "OutputFormat", "AcceptedInput", "ProducedOutput", "InputEnded", "OutputEnded"};
        c54.n(6, objArr6);
        jnVarA.I("VideoEncoder", zw6.h(6, objArr6));
        jnVarA.I("Muxer", zw6.p("InputFormat", "CanWriteSample", "AcceptedInput", "InputEnded", "OutputEnded"));
        jnVarA.j();
        a = new LinkedHashMap();
        SystemClock.elapsedRealtime();
    }

    public static synchronized void a() {
        synchronized (d54.class) {
        }
    }
}
