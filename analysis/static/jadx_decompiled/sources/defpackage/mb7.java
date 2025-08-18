package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface mb7 extends lb7 {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    ec7 getReturnType();

    List getTypeParameters();

    fc7 getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
