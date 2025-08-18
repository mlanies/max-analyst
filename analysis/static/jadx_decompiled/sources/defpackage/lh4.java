package defpackage;

import android.media.MediaMuxer;
import androidx.media3.muxer.Muxer$MuxerException;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class lh4 implements b66, cj9, lxd {
    public long a;

    public lh4(int i) {
        switch (i) {
            case 4:
                this.a = -9223372036854775807L;
                break;
            default:
                this.a = -1L;
                break;
        }
    }

    @Override // defpackage.cj9
    public fj9 D(String str) {
        try {
            return new h36(new MediaMuxer(str, 0), this.a);
        } catch (IOException e) {
            throw new Muxer$MuxerException("Error creating muxer", e);
        }
    }

    @Override // defpackage.lxd
    public kxd Q() {
        return new wva(this);
    }

    public long a(long j) {
        if (j == -1) {
            this.a = -1L;
            return -1L;
        }
        long j2 = this.a;
        if (j2 == -1 || j < j2) {
            this.a = j;
            return 0L;
        }
        long j3 = j - j2;
        this.a = j;
        return j3;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        xlc xlcVarA = xlc.a(1, "SELECT * FROM draft_uploads WHERE chat_id = ?");
        xlcVarA.j(1, this.a);
        return new t28(new sp4((tp4) obj, xlcVarA, 1));
    }

    @Override // defpackage.cj9
    public zw6 w(int i) {
        if (i == 2) {
            return h36.s0;
        }
        if (i == 1) {
            return h36.t0;
        }
        ls5 ls5Var = zw6.b;
        return ffc.X;
    }
}
