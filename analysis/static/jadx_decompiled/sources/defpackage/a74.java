package defpackage;

import android.media.MediaCodecInfo;
import android.util.Size;

/* loaded from: classes.dex */
public final /* synthetic */ class a74 implements km7, oa4, mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a74(int i, int i2, Object obj) {
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.oa4
    public int a(MediaCodecInfo mediaCodecInfo) {
        String str = (String) this.c;
        int i = this.a;
        int i2 = this.b;
        Size sizeH = h15.h(mediaCodecInfo, str, i, i2);
        if (sizeH == null) {
            return Integer.MAX_VALUE;
        }
        return Math.abs((i * i2) - (sizeH.getHeight() * sizeH.getWidth()));
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        ((gd) obj).I((fd) this.c, this.a, this.b);
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        ce4 ce4Var = (ce4) this.c;
        ce4Var.getClass();
        ce4Var.e(new wt1(ce4Var, 23, new ca0(this.a, this.b, lq1Var)), new zd4(lq1Var, 0));
        return "DefaultSurfaceProcessor#snapshot";
    }
}
