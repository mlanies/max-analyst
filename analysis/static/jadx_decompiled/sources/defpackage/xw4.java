package defpackage;

import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* loaded from: classes.dex */
public final class xw4 implements zb4 {
    public final /* synthetic */ gh7 a;
    public final /* synthetic */ EmojiCompatInitializer b;

    public xw4(EmojiCompatInitializer emojiCompatInitializer, gh7 gh7Var) {
        this.b = emojiCompatInitializer;
        this.a = gh7Var;
    }

    @Override // defpackage.zb4
    public final void onResume(eh7 eh7Var) {
        this.b.getClass();
        qd3.a(Looper.getMainLooper()).postDelayed(new wdg(3), 500L);
        this.a.f(this);
    }
}
