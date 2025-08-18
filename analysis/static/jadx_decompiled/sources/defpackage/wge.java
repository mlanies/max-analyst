package defpackage;

/* loaded from: classes2.dex */
public interface wge {
    default void a() {
        k56 onRequestInterceptTouchEvent = getOnRequestInterceptTouchEvent();
        if (onRequestInterceptTouchEvent != null) {
            onRequestInterceptTouchEvent.invoke();
        }
    }

    k56 getOnRequestInterceptTouchEvent();

    m56 getOnTouch();

    void setOnRequestInterceptTouchEvent(k56 k56Var);

    void setOnTouch(m56 m56Var);
}
