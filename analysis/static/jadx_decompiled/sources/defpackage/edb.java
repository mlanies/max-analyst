package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.stickerspreview.StickerPreviewScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class edb implements k64 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ edb(long j, ek2 ek2Var) {
        this.a = 0;
        this.c = ek2Var;
        this.b = j;
    }

    @Override // defpackage.k64
    public final Object a() {
        switch (this.a) {
            case 0:
                ek2 ek2Var = ek2.ADMIN;
                ek2 ek2Var2 = (ek2) this.c;
                long j = this.b;
                return ek2Var2 == ek2Var ? new ChatAdminsScreen(j) : new ChatMembersScreen(j, ek2Var2);
            case 1:
                return new ProfileEditScreen(this.b, (reb) this.c);
            default:
                Bundle bundle = (Bundle) this.c;
                Long lV = i24.v("chat_id", bundle);
                long jLongValue = lV != null ? lV.longValue() : 0L;
                Long lV2 = i24.v("forward_id", bundle);
                return new StickerPreviewScreen(this.b, jLongValue, lV2 != null ? lV2.longValue() : 0L);
        }
    }

    public /* synthetic */ edb(long j, Parcelable parcelable, int i) {
        this.a = i;
        this.b = j;
        this.c = parcelable;
    }
}
