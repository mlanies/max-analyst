package defpackage;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class ds4 {
    public static final Field a;

    static {
        Field declaredField = null;
        try {
            declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        a = declaredField;
    }
}
