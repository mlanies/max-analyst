package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.profile.screens.media.ChatMediaListWidget;

/* loaded from: classes2.dex */
public final class qg2 extends p04 {
    public static final yb9 B0 = new yb9();
    public final Object A0;
    public final /* synthetic */ int w0 = 0;
    public final long x0;
    public List y0;
    public final Object z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg2(uu3 uu3Var, long j) {
        super(uu3Var, 1);
        yb9 yb9Var = B0;
        this.z0 = uu3Var;
        this.x0 = j;
        this.A0 = yb9Var;
        this.y0 = x53.D0(ih2.o);
    }

    @Override // defpackage.p04
    public final void E(znc zncVar, int i) {
        uu3 uu3Var;
        switch (this.w0) {
            case 0:
                if (zncVar.n()) {
                    return;
                }
                ih2 ih2Var = (ih2) this.y0.get(i);
                ((yb9) this.A0).getClass();
                ChatMediaListWidget chatMediaListWidget = new ChatMediaListWidget(this.x0, ih2Var);
                chatMediaListWidget.setTargetController((uu3) this.z0);
                chatMediaListWidget.setRetainViewMode(tu3.b);
                zncVar.R(new coc(chatMediaListWidget, null, null, null, false, -1));
                return;
            default:
                if (!zncVar.n() && i >= 0 && i <= y53.L(this.y0)) {
                    int i2 = tc7.$EnumSwitchMapping$0[((bd7) this.y0.get(i)).ordinal()];
                    tu3 tu3Var = tu3.b;
                    String str = (String) this.A0;
                    if (i2 == 1) {
                        KeyboardStickersWidget keyboardStickersWidget = new KeyboardStickersWidget(this.x0, str, null);
                        keyboardStickersWidget.c = (gw7) this.z0;
                        keyboardStickersWidget.setRetainViewMode(tu3Var);
                        uu3Var = keyboardStickersWidget;
                    } else if (i2 == 2) {
                        uu3 keyboardEmojiWidget = new KeyboardEmojiWidget(str, null);
                        keyboardEmojiWidget.setRetainViewMode(tu3Var);
                        uu3Var = keyboardEmojiWidget;
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        uu3Var = null;
                    }
                    if (uu3Var == null) {
                        return;
                    }
                    zncVar.R(new coc(uu3Var, null, null, null, false, -1));
                    return;
                }
                return;
        }
    }

    @Override // defpackage.hdc
    public final int j() {
        switch (this.w0) {
        }
        return this.y0.size();
    }

    @Override // defpackage.p04, defpackage.hdc
    public final long k(int i) {
        switch (this.w0) {
            case 0:
                return ((ih2) this.y0.get(i)).ordinal();
            default:
                return ((bd7) this.y0.get(i)).c;
        }
    }

    public qg2(uu3 uu3Var, gw7 gw7Var, long j, String str) {
        super(uu3Var, 1);
        this.z0 = gw7Var;
        this.x0 = j;
        this.A0 = str;
        this.y0 = nz4.a;
    }
}
