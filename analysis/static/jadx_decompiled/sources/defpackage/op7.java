package defpackage;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class op7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ pp7 Y;
    public final /* synthetic */ gef Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op7(pp7 pp7Var, gef gefVar, Continuation continuation) {
        super(2, continuation);
        this.Y = pp7Var;
        this.Z = gefVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((op7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        op7 op7Var = new op7(this.Y, this.Z, continuation);
        op7Var.X = obj;
        return op7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        for (Bitmap bitmap : (List) this.Y.d.getValue()) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
        ((MediaMetadataRetriever) this.Y.f.getValue()).setDataSource(this.Z.l().getPath());
        try {
            String strExtractMetadata = ((MediaMetadataRetriever) this.Y.f.getValue()).extractMetadata(9);
            this.Y.h = strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : this.Z.c();
        } catch (Exception e) {
            hm9.p(this.Y.b, "Can't extract duration", e);
            this.Y.h = this.Z.c();
        }
        ArrayList arrayList = new ArrayList();
        int i = this.Y.g;
        int i2 = 0;
        while (true) {
            e5f e5fVar = e5f.a;
            if (i2 >= i || !j1e.z(sx3Var)) {
                return e5fVar;
            }
            long j = this.Y.h;
            pp7 pp7Var = this.Y;
            long j2 = (j / pp7Var.g) * i2 * 1000;
            MediaMetadataRetriever mediaMetadataRetriever = (MediaMetadataRetriever) pp7Var.f.getValue();
            m26 m26Var = pp7Var.a;
            Bitmap scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j2, 2, m26Var.b, m26Var.c);
            if (scaledFrameAtTime != null && j1e.z(sx3Var)) {
                arrayList.add(scaledFrameAtTime);
                this.Y.d.m(null, arrayList);
            }
            i2++;
        }
    }
}
