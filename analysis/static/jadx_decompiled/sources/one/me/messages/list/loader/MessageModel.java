package one.me.messages.list.loader;

import android.text.Layout;
import androidx.annotation.Keep;
import defpackage.by8;
import defpackage.cw8;
import defpackage.ey8;
import defpackage.h4f;
import defpackage.iu8;
import defpackage.ix8;
import defpackage.ms2;
import defpackage.ol7;
import defpackage.ow8;
import defpackage.pw8;
import defpackage.rh4;
import defpackage.ry8;
import defpackage.tc9;
import defpackage.tpa;
import defpackage.tz;
import defpackage.vk6;
import defpackage.x9e;
import defpackage.zof;
import defpackage.zr6;
import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lone/me/messages/list/loader/MessageModel;", "Lvk6;", "Lol7;", "pw8", "ow8", "Companion", "message-list_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final /* data */ class MessageModel implements vk6, ol7 {
    public static final Companion J0 = new Companion();
    public final int A0;
    public final ix8 B0;
    public final long C0;
    public final boolean D0;
    public final iu8 E0;
    public Layout F0;
    public Layout G0;
    public ow8 H0;
    public int I0;
    public final CharSequence X;
    public final CharSequence Y;
    public final zof Z;
    public final long a;
    public final long b;
    public final long c;
    public final CharSequence o;
    public final boolean s0;
    public final boolean t0;
    public final tz u0;
    public final boolean v0;
    public final by8 w0;
    public final cw8 x0;
    public final pw8 y0;
    public final tc9 z0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lone/me/messages/list/loader/MessageModel$Companion;", "", "", "displayText", "", "pinId", "Lone/me/messages/list/loader/MessageModel;", "control", "(Ljava/lang/CharSequence;J)Lone/me/messages/list/loader/MessageModel;", "message-list_release"}, k = 1, mv = {2, 0, 0})
    public static final class Companion {
        @Keep
        public final MessageModel control(CharSequence displayText, long pinId) {
            tz tzVar = tz.f;
            iu8 iu8Var = iu8.Y;
            return new MessageModel(0L, 0L, 0L, displayText, "", "", zof.b, false, false, tzVar, false, null, null, new pw8(pinId), null, 2, null, 0L, true, iu8Var, null, 0, 6315008);
        }
    }

    public MessageModel(long j, long j2, long j3, CharSequence charSequence, String str, CharSequence charSequence2, zof zofVar, boolean z, boolean z2, tz tzVar, boolean z3, by8 by8Var, cw8 cw8Var, pw8 pw8Var, tc9 tc9Var, int i, ix8 ix8Var, long j4, boolean z4, iu8 iu8Var, ow8 ow8Var, int i2, int i3) {
        boolean z5 = (i3 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? false : z3;
        by8 by8Var2 = (i3 & 2048) != 0 ? null : by8Var;
        cw8 cw8Var2 = (i3 & 4096) != 0 ? null : cw8Var;
        pw8 pw8Var2 = (i3 & 8192) != 0 ? null : pw8Var;
        tc9 tc9Var2 = (i3 & 16384) != 0 ? null : tc9Var;
        ow8 ow8Var2 = (4194304 & i3) != 0 ? null : ow8Var;
        int i4 = (i3 & 8388608) != 0 ? -1 : i2;
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = charSequence;
        this.X = str;
        this.Y = charSequence2;
        this.Z = zofVar;
        this.s0 = z;
        this.t0 = z2;
        this.u0 = tzVar;
        this.v0 = z5;
        this.w0 = by8Var2;
        this.x0 = cw8Var2;
        this.y0 = pw8Var2;
        this.z0 = tc9Var2;
        this.A0 = i;
        this.B0 = ix8Var;
        this.C0 = j4;
        this.D0 = z4;
        this.E0 = iu8Var;
        this.F0 = null;
        this.G0 = null;
        this.H0 = ow8Var2;
        this.I0 = i4;
    }

    @Keep
    public static final MessageModel control(CharSequence charSequence, long j) {
        return J0.control(charSequence, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageModel)) {
            return false;
        }
        MessageModel messageModel = (MessageModel) obj;
        return this.a == messageModel.a && this.b == messageModel.b && this.c == messageModel.c && tpa.f(this.o, messageModel.o) && tpa.f(this.X, messageModel.X) && tpa.f(this.Y, messageModel.Y) && this.Z == messageModel.Z && this.s0 == messageModel.s0 && this.t0 == messageModel.t0 && tpa.f(this.u0, messageModel.u0) && this.v0 == messageModel.v0 && tpa.f(this.w0, messageModel.w0) && tpa.f(this.x0, messageModel.x0) && tpa.f(this.y0, messageModel.y0) && tpa.f(this.z0, messageModel.z0) && this.A0 == messageModel.A0 && tpa.f(this.B0, messageModel.B0) && this.C0 == messageModel.C0 && this.D0 == messageModel.D0 && this.E0 == messageModel.E0 && tpa.f(this.F0, messageModel.F0) && tpa.f(this.G0, messageModel.G0) && tpa.f(this.H0, messageModel.H0) && ry8.a(this.I0, messageModel.I0);
    }

    @Override // defpackage.vk6
    /* renamed from: getId, reason: from getter */
    public final long getA() {
        return this.a;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        return this.a == ol7Var.getItemId();
    }

    public final int hashCode() {
        int iD = ms2.d((this.u0.hashCode() + ms2.d(ms2.d((this.Z.hashCode() + rh4.f(this.Y, rh4.f(this.X, rh4.f(this.o, h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31), 31)) * 31, 31, this.s0), 31, this.t0)) * 31, 31, this.v0);
        by8 by8Var = this.w0;
        int iHashCode = (iD + (by8Var == null ? 0 : by8Var.hashCode())) * 31;
        cw8 cw8Var = this.x0;
        int iHashCode2 = (iHashCode + (cw8Var == null ? 0 : cw8Var.hashCode())) * 31;
        pw8 pw8Var = this.y0;
        int iHashCode3 = (iHashCode2 + (pw8Var == null ? 0 : Long.hashCode(pw8Var.a))) * 31;
        tc9 tc9Var = this.z0;
        int iG = ey8.g(this.A0, (iHashCode3 + (tc9Var == null ? 0 : tc9Var.hashCode())) * 31, 31);
        ix8 ix8Var = this.B0;
        int iHashCode4 = (this.E0.hashCode() + ms2.d(h4f.m((iG + (ix8Var == null ? 0 : ix8Var.hashCode())) * 31, 31, this.C0), 31, this.D0)) * 31;
        Layout layout = this.F0;
        int iHashCode5 = (iHashCode4 + (layout == null ? 0 : layout.hashCode())) * 31;
        Layout layout2 = this.G0;
        int iHashCode6 = (iHashCode5 + (layout2 == null ? 0 : layout2.hashCode())) * 31;
        ow8 ow8Var = this.H0;
        return Integer.hashCode(this.I0) + ((iHashCode6 + (ow8Var != null ? ow8Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.vk6
    /* renamed from: k, reason: from getter */
    public final long getC() {
        return this.c;
    }

    @Override // defpackage.ol7
    /* renamed from: l, reason: from getter */
    public final int getI0() {
        return this.I0;
    }

    public final String m() {
        String strE = ry8.e(this.I0);
        StringBuilder sb = new StringBuilder("\n        MessageModel(mid=");
        sb.append(this.a);
        sb.append(", sid=");
        sb.append(this.b);
        sb.append(" time=");
        ms2.j(this.c, " viewType=", strE, sb);
        sb.append(")\n    ");
        return x9e.b0(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    @Override // defpackage.ol7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r15) {
        /*
            r14 = this;
            ol7 r15 = (defpackage.ol7) r15
            boolean r0 = r15 instanceof one.me.messages.list.loader.MessageModel
            if (r0 != 0) goto L9
            r14 = 0
            goto L82
        L9:
            tz r0 = r14.u0
            z07 r1 = r0.e
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1a
            r4 = r15
            one.me.messages.list.loader.MessageModel r4 = (one.me.messages.list.loader.MessageModel) r4
            tz r4 = r4.u0
            z07 r4 = r4.e
            if (r4 != 0) goto L2b
        L1a:
            if (r1 == 0) goto L28
            r4 = r15
            one.me.messages.list.loader.MessageModel r4 = (one.me.messages.list.loader.MessageModel) r4
            tz r4 = r4.u0
            z07 r4 = r4.e
            boolean r1 = r1.a(r4)
            goto L29
        L28:
            r1 = r3
        L29:
            if (r1 != 0) goto L2d
        L2b:
            r13 = r3
            goto L2e
        L2d:
            r13 = r2
        L2e:
            android.text.Layout r1 = r14.F0
            one.me.messages.list.loader.MessageModel r15 = (one.me.messages.list.loader.MessageModel) r15
            android.text.Layout r4 = r15.F0
            boolean r1 = defpackage.tpa.f(r1, r4)
            r5 = r1 ^ 1
            android.text.Layout r1 = r14.G0
            android.text.Layout r4 = r15.G0
            boolean r1 = defpackage.tpa.f(r1, r4)
            r6 = r1 ^ 1
            zof r1 = r14.Z
            zof r4 = r15.Z
            if (r1 == r4) goto L4c
            r8 = r3
            goto L4d
        L4c:
            r8 = r2
        L4d:
            java.lang.CharSequence r1 = r14.X
            java.lang.CharSequence r4 = r15.X
            boolean r1 = defpackage.tpa.f(r1, r4)
            r7 = r1 ^ 1
            by8 r1 = r14.w0
            by8 r4 = r15.w0
            boolean r1 = defpackage.tpa.f(r1, r4)
            r9 = r1 ^ 1
            ix8 r1 = r14.B0
            ix8 r4 = r15.B0
            boolean r1 = defpackage.tpa.f(r1, r4)
            r10 = r1 ^ 1
            boolean r14 = r14.v0
            boolean r1 = r15.v0
            if (r14 == r1) goto L73
            r11 = r3
            goto L74
        L73:
            r11 = r2
        L74:
            tz r14 = r15.u0
            boolean r14 = r0.equals(r14)
            r12 = r14 ^ 1
            zw8 r14 = new zw8
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L82:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.messages.list.loader.MessageModel.n(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        return equals((ol7) obj);
    }

    public final String toString() {
        Layout layout = this.F0;
        Layout layout2 = this.G0;
        ow8 ow8Var = this.H0;
        String strE = ry8.e(this.I0);
        StringBuilder sb = new StringBuilder("MessageModel(messageId=");
        sb.append(this.a);
        sb.append(", serverId=");
        sb.append(this.b);
        sb.append(", sortTime=");
        sb.append(this.c);
        sb.append(", displayText=");
        sb.append((Object) this.o);
        sb.append(", displayTime=");
        sb.append((Object) this.X);
        sb.append(", decorTime=");
        sb.append((Object) this.Y);
        sb.append(", viewStatus=");
        sb.append(this.Z);
        sb.append(", drawBackground=");
        sb.append(this.s0);
        sb.append(", needCorners=");
        sb.append(this.t0);
        sb.append(", attachInfo=");
        sb.append(this.u0);
        sb.append(", isEdit=");
        sb.append(this.v0);
        sb.append(", messageTextStaticLayout=");
        sb.append(this.w0);
        sb.append(", messageLink=");
        sb.append(this.x0);
        sb.append(", controlInfo=");
        sb.append(this.y0);
        sb.append(", widgetState=");
        sb.append(this.z0);
        sb.append(", chatType=");
        int i = this.A0;
        sb.append(i != 1 ? i != 2 ? "null" : "CHAT" : "DIALOG");
        sb.append(", reactionsData=");
        sb.append(this.B0);
        sb.append(", senderId=");
        sb.append(this.C0);
        sb.append(", isIncoming=");
        sb.append(this.D0);
        sb.append(", deliveryStatus=");
        sb.append(this.E0);
        sb.append(", sender=");
        sb.append(layout);
        sb.append(", alias=");
        sb.append(layout2);
        sb.append(", avatarParams=");
        sb.append(ow8Var);
        sb.append(", messageViewType=");
        return zr6.l(sb, strE, ")");
    }
}
