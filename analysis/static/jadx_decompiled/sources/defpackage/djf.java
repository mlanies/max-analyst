package defpackage;

import android.net.Uri;
import android.util.Base64;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class djf extends ffe implements a66 {
    public final /* synthetic */ byte[] X;
    public final /* synthetic */ ejf Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djf(byte[] bArr, ejf ejfVar, Continuation continuation) {
        super(2, continuation);
        this.X = bArr;
        this.Y = ejfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        djf djfVar = (djf) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        djfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new djf(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        String str;
        Object value;
        od2.a0(obj);
        String strEncodeToString = Base64.encodeToString(this.X, 2);
        StringBuilder sb = new StringBuilder("data:");
        switch (2) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "IMAGE_JPEG";
                break;
            case 3:
                str = "IMAGE_PNG";
                break;
            case 4:
                str = "IMAGE_WEBP";
                break;
            case 5:
                str = "IMAGE_GIF";
                break;
            case 6:
                str = "IMAGE_ANY";
                break;
            case 7:
                str = "IMAGE_HEIC";
                break;
            case 8:
                str = "VIDEO_MP4";
                break;
            case 9:
                str = "VIDEO_ANY";
                break;
            case 10:
                str = "TEXT_PLAIN";
                break;
            case 11:
                str = "TEXT_VCARD";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(";base64,");
        sb.append(strEncodeToString);
        Uri uri = Uri.parse(sb.toString());
        q0e q0eVar = this.Y.A0;
        do {
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, vif.a((vif) value, null, null, uri.toString(), 3)));
        return e5f.a;
    }
}
