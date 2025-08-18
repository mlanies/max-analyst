package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class pdb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final odb g;
    public final odb h;
    public final odb i;
    public final odb j;
    public final odb k;
    public final odb l;
    public final odb m;

    public pdb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, odb odbVar, odb odbVar2, odb odbVar3, odb odbVar4, odb odbVar5, odb odbVar6, odb odbVar7) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = odbVar;
        this.h = odbVar2;
        this.i = odbVar3;
        this.j = odbVar4;
        this.k = odbVar5;
        this.l = odbVar6;
        this.m = odbVar7;
    }

    public static pdb a(pdb pdbVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, odb odbVar, odb odbVar2, odb odbVar3, odb odbVar4, odb odbVar5, odb odbVar6, odb odbVar7, int i) {
        return new pdb((i & 1) != 0 ? pdbVar.a : z, (i & 2) != 0 ? pdbVar.b : z2, (i & 4) != 0 ? pdbVar.c : z3, (i & 8) != 0 ? pdbVar.d : z4, (i & 16) != 0 ? pdbVar.e : z5, (i & 32) != 0 ? pdbVar.f : z6, (i & 64) != 0 ? pdbVar.g : odbVar, (i & 128) != 0 ? pdbVar.h : odbVar2, (i & 256) != 0 ? pdbVar.i : odbVar3, (i & 512) != 0 ? pdbVar.j : odbVar4, (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? pdbVar.k : odbVar5, (i & 2048) != 0 ? pdbVar.l : odbVar6, (i & 4096) != 0 ? pdbVar.m : odbVar7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pdb)) {
            return false;
        }
        pdb pdbVar = (pdb) obj;
        return this.a == pdbVar.a && this.b == pdbVar.b && this.c == pdbVar.c && this.d == pdbVar.d && this.e == pdbVar.e && this.f == pdbVar.f && tpa.f(this.g, pdbVar.g) && tpa.f(this.h, pdbVar.h) && tpa.f(this.i, pdbVar.i) && tpa.f(this.j, pdbVar.j) && tpa.f(this.k, pdbVar.k) && tpa.f(this.l, pdbVar.l) && tpa.f(this.m, pdbVar.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProfileEditAdminPermissionsModel(isSuperAdmin=" + this.a + ", editSendDeleteMessagesEnabled=" + this.b + ", pinMessagesEnabled=" + this.c + ", changeChatInfoEnabled=" + this.d + ", changeMembersEnabled=" + this.e + ", editLinkEnabled=" + this.f + ", sendMessagePermState=" + this.g + ", editMessagePermState=" + this.h + ", deleteMessagePermState=" + this.i + ", pinMessagePermState=" + this.j + ", changeChatInfoPermState=" + this.k + ", controlMembersPermState=" + this.l + ", controlAdminsPermState=" + this.m + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ pdb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, odb odbVar, odb odbVar2, odb odbVar3, odb odbVar4, odb odbVar5, odb odbVar6, odb odbVar7, int i) {
        boolean z7 = (i & 1) != 0 ? false : z;
        boolean z8 = (i & 2) != 0 ? false : z2;
        boolean z9 = (i & 4) != 0 ? false : z3;
        boolean z10 = (i & 8) != 0 ? false : z4;
        boolean z11 = (i & 16) != 0 ? false : z5;
        this(z7, z8, z9, z10, z11, z6, (i & 64) != 0 ? new odb(z8, true) : odbVar, (i & 128) != 0 ? new odb(z8, true) : odbVar2, (i & 256) != 0 ? new odb(z8, true) : odbVar3, (i & 512) != 0 ? new odb(z9, true) : odbVar4, (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? new odb(z10, true) : odbVar5, (i & 2048) != 0 ? new odb(z11, true) : odbVar6, (i & 4096) != 0 ? new odb(z7, true) : odbVar7);
    }
}
