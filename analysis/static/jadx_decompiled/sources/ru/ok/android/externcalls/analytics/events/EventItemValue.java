package ru.ok.android.externcalls.analytics.events;

import defpackage.tpa;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemValue;", "", "FloatValue", "IntValue", "LongValue", "StringValue", "Lru/ok/android/externcalls/analytics/events/EventItemValue$FloatValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue$IntValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue$LongValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue$StringValue;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface EventItemValue {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemValue$FloatValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "value", "", "constructor-impl", "(F)F", "getValue", "()F", "equals", "", "other", "", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(F)I", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class FloatValue implements EventItemValue {
        private final float value;

        private /* synthetic */ FloatValue(float f) {
            this.value = f;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FloatValue m48boximpl(float f) {
            return new FloatValue(f);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static float m49constructorimpl(float f) {
            return f;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m50equalsimpl(float f, Object obj) {
            return (obj instanceof FloatValue) && Float.compare(f, ((FloatValue) obj).m54unboximpl()) == 0;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m51equalsimpl0(float f, float f2) {
            return Float.compare(f, f2) == 0;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m52hashCodeimpl(float f) {
            return Float.hashCode(f);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m53toStringimpl(float f) {
            return String.valueOf(f);
        }

        public boolean equals(Object obj) {
            return m50equalsimpl(this.value, obj);
        }

        public final float getValue() {
            return this.value;
        }

        public int hashCode() {
            return m52hashCodeimpl(this.value);
        }

        public String toString() {
            return m53toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m54unboximpl() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u000f\u0010\u0010\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemValue$IntValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class IntValue implements EventItemValue {
        private final int value;

        private /* synthetic */ IntValue(int i) {
            this.value = i;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ IntValue m55boximpl(int i) {
            return new IntValue(i);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m56constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m57equalsimpl(int i, Object obj) {
            return (obj instanceof IntValue) && i == ((IntValue) obj).m61unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m58equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m59hashCodeimpl(int i) {
            return Integer.hashCode(i);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m60toStringimpl(int i) {
            return String.valueOf(i);
        }

        public boolean equals(Object obj) {
            return m57equalsimpl(this.value, obj);
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return m59hashCodeimpl(this.value);
        }

        public String toString() {
            return m60toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m61unboximpl() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemValue$LongValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "value", "", "constructor-impl", "(J)J", "getValue", "()J", "equals", "", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LongValue implements EventItemValue {
        private final long value;

        private /* synthetic */ LongValue(long j) {
            this.value = j;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ LongValue m62boximpl(long j) {
            return new LongValue(j);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m63constructorimpl(long j) {
            return j;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m64equalsimpl(long j, Object obj) {
            return (obj instanceof LongValue) && j == ((LongValue) obj).m68unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m65equalsimpl0(long j, long j2) {
            return j == j2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m66hashCodeimpl(long j) {
            return Long.hashCode(j);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m67toStringimpl(long j) {
            return String.valueOf(j);
        }

        public boolean equals(Object obj) {
            return m64equalsimpl(this.value, obj);
        }

        public final long getValue() {
            return this.value;
        }

        public int hashCode() {
            return m66hashCodeimpl(this.value);
        }

        public String toString() {
            return m67toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m68unboximpl() {
            return this.value;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemValue$StringValue;", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", "toString", "toString-impl", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StringValue implements EventItemValue {
        private final String value;

        private /* synthetic */ StringValue(String str) {
            this.value = str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ StringValue m69boximpl(String str) {
            return new StringValue(str);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static String m70constructorimpl(String str) {
            return str;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m71equalsimpl(String str, Object obj) {
            return (obj instanceof StringValue) && tpa.f(str, ((StringValue) obj).m75unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m72equalsimpl0(String str, String str2) {
            return tpa.f(str, str2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m73hashCodeimpl(String str) {
            return str.hashCode();
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m74toStringimpl(String str) {
            return str.toString();
        }

        public boolean equals(Object obj) {
            return m71equalsimpl(this.value, obj);
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return m73hashCodeimpl(this.value);
        }

        public String toString() {
            return m74toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ String m75unboximpl() {
            return this.value;
        }
    }
}
