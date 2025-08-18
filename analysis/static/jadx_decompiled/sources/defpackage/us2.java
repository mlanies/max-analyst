package defpackage;

import android.view.View;
import java.util.BitSet;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class us2 extends hqd {
    public static l62 G(ml2 ml2Var) {
        int iOrdinal = ml2Var.ordinal();
        if (iOrdinal == 0) {
            return l62.a;
        }
        if (iOrdinal == 1) {
            return l62.b;
        }
        if (iOrdinal == 2) {
            return l62.c;
        }
        if (iOrdinal == 3) {
            return l62.o;
        }
        if (iOrdinal == 4) {
            return l62.X;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(nl2 nl2Var) {
        m62 m62Var = (m62) this.a;
        int id = m62Var.getId();
        m62Var.setId(Long.hashCode(nl2Var.a));
        m62Var.setTitle(nl2Var.c);
        CharSequence charSequence = nl2Var.Y;
        if (!(!(charSequence == null || w9e.C0(charSequence)))) {
            charSequence = null;
        }
        if (charSequence == null) {
            charSequence = nl2Var.X;
        }
        m62Var.setSubtitle(charSequence);
        m62Var.setTyping(nl2Var.Z);
        m62Var.setPinned(nl2Var.B0 != 0);
        m62Var.setMuted(nl2Var.y0);
        m62Var.setOnline(nl2Var.t0);
        m62Var.setCallBadge(nl2Var.G0);
        m62Var.setVerified(nl2Var.u0);
        m62Var.setMention(nl2Var.A0);
        m62Var.setReaction(nl2Var.z0);
        m62Var.setTime(nl2Var.s0);
        m62Var.e(nl2Var.x0, id == m62Var.getId());
        m62Var.setStatus(G(nl2Var.w0));
        m62Var.c(nl2Var.b, nl2Var.E0, Long.valueOf(nl2Var.D0));
    }

    @Override // defpackage.hqd
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void B(nl2 nl2Var, Object obj) {
        ll2 ll2Var = obj instanceof ll2 ? (ll2) obj : null;
        if (ll2Var == null) {
            A(nl2Var);
            return;
        }
        BitSet bitSet = (BitSet) ll2Var.b;
        boolean z = bitSet.get(1);
        View view = this.a;
        if (z) {
            ((m62) view).c(nl2Var.b, nl2Var.E0, Long.valueOf(nl2Var.D0));
        }
        if (bitSet.get(0)) {
            ((m62) view).setOnline(nl2Var.t0);
        }
        if (bitSet.get(2)) {
            ((m62) view).setTitle(nl2Var.c);
        }
        if (bitSet.get(4)) {
            m62 m62Var = (m62) view;
            CharSequence charSequence = nl2Var.Y;
            CharSequence charSequence2 = (charSequence == null || w9e.C0(charSequence)) ^ true ? charSequence : null;
            if (charSequence2 == null) {
                charSequence2 = nl2Var.X;
            }
            m62Var.setSubtitle(charSequence2);
        }
        if (bitSet.get(5)) {
            ((m62) view).setTyping(nl2Var.Z);
        }
        if (bitSet.get(6)) {
            ((m62) view).setTime(nl2Var.s0);
        }
        if (bitSet.get(8)) {
            ((m62) view).setStatus(G(nl2Var.w0));
        }
        if (bitSet.get(9)) {
            ((m62) view).e(nl2Var.x0, true);
        }
        if (bitSet.get(10)) {
            ((m62) view).setMuted(nl2Var.y0);
        }
        if (bitSet.get(11)) {
            ((m62) view).setReaction(nl2Var.z0);
        }
        if (bitSet.get(12)) {
            ((m62) view).setMention(nl2Var.A0);
        }
        if (bitSet.get(13)) {
            ((m62) view).setPinned(nl2Var.B0 != 0);
        }
        if (bitSet.get(14)) {
            ((m62) view).setCallBadge(nl2Var.G0);
        }
    }
}
