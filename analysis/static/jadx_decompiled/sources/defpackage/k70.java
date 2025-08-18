package defpackage;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class k70 implements tk6 {
    public final Object X;
    public long a;
    public long b;
    public long c;
    public final Object o;

    public k70(je7 je7Var, long j, long j2, long j3, Set set) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = set;
        this.X = je7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.ArrayList r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k70.a(java.util.ArrayList, int, int):void");
    }

    @Override // defpackage.tk6
    public sk6 i() {
        ae2 ae2Var = new ae2(this, null);
        hz4 hz4Var = hz4.a;
        e52 e52Var = (e52) j47.f0(hz4Var, ae2Var);
        return new be2((x82) j47.f0(hz4Var, new ce2(this, e52Var, null)), e52Var, this);
    }

    public k70(long j) {
        this.o = new ArrayList();
        this.X = new ArrayList();
        Collections.emptyList();
        this.c = j;
        this.a = 14400000L;
        this.b = 10;
    }

    public k70(AudioTrack audioTrack) {
        this.o = audioTrack;
        this.X = new AudioTimestamp();
    }
}
