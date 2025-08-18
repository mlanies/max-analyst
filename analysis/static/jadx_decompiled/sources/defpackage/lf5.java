package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class lf5 extends bz {
    public final long X;
    public final String Y;
    public final bz Z;
    public final long o;
    public final String s0;

    public lf5(long j, long j2, String str, bz bzVar, boolean z, String str2, boolean z2) {
        super(b10.FILE, z, z2);
        this.o = j;
        this.X = j2;
        this.Y = str;
        this.Z = bzVar;
        this.s0 = str2;
    }

    @Override // defpackage.bz
    public final HashMap a() {
        HashMap mapA = super.a();
        String str = this.s0;
        if (oag.t(str)) {
            mapA.put("fileId", Long.valueOf(this.o));
        } else {
            mapA.put(ApiProtocol.KEY_TOKEN, str);
        }
        return mapA;
    }
}
