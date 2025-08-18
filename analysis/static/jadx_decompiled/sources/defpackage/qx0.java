package defpackage;

import android.content.res.XmlResourceParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class qx0 implements XmlResourceParser {
    public final XmlResourceParser a;

    public qx0(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
    }

    @Override // android.content.res.XmlResourceParser, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void defineEntityReplacementText(String str, String str2) throws XmlPullParserException {
        this.a.defineEntityReplacementText(str, str2);
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(int i, boolean z) {
        return this.a.getAttributeBooleanValue(i, z);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final int getAttributeCount() {
        return this.a.getAttributeCount();
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(int i, float f) {
        return this.a.getAttributeFloatValue(i, f);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(int i, int i2) {
        return this.a.getAttributeIntValue(i, i2);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeListValue(int i, String[] strArr, int i2) {
        return this.a.getAttributeListValue(i, strArr, i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeName(int i) {
        return this.a.getAttributeName(i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeNameResource(int i) {
        return this.a.getAttributeNameResource(i);
    }

    @Override // android.content.res.XmlResourceParser, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeNamespace(int i) {
        return this.a.getAttributeNamespace(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributePrefix(int i) {
        return this.a.getAttributePrefix(i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(int i, int i2) {
        return this.a.getAttributeResourceValue(i, i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getAttributeType(int i) {
        return this.a.getAttributeType(i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(int i, int i2) {
        return this.a.getAttributeUnsignedIntValue(i, i2);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(int i) {
        return this.a.getAttributeValue(i);
    }

    @Override // android.util.AttributeSet
    public final String getClassAttribute() {
        return this.a.getClassAttribute();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getColumnNumber() {
        return this.a.getColumnNumber();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getDepth() {
        return this.a.getDepth();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getEventType() {
        return this.a.getEventType();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean getFeature(String str) {
        return this.a.getFeature(str);
    }

    @Override // android.util.AttributeSet
    public final String getIdAttribute() {
        return this.a.getIdAttribute();
    }

    @Override // android.util.AttributeSet
    public final int getIdAttributeResourceValue(int i) {
        return this.a.getIdAttributeResourceValue(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getInputEncoding() {
        return this.a.getInputEncoding();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getLineNumber() {
        return this.a.getLineNumber();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getName() {
        return this.a.getName();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace() {
        return this.a.getNamespace();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int getNamespaceCount(int i) {
        return this.a.getNamespaceCount(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespacePrefix(int i) {
        return this.a.getNamespacePrefix(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespaceUri(int i) {
        return this.a.getNamespaceUri(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getPositionDescription() {
        return this.a.getPositionDescription();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getPrefix() {
        return this.a.getPrefix();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final Object getProperty(String str) {
        return this.a.getProperty(str);
    }

    @Override // android.util.AttributeSet
    public final int getStyleAttribute() {
        return this.a.getStyleAttribute();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getText() {
        return this.a.getText();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final char[] getTextCharacters(int[] iArr) {
        return this.a.getTextCharacters(iArr);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isAttributeDefault(int i) {
        return this.a.isAttributeDefault(i);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isEmptyElementTag() {
        return this.a.isEmptyElementTag();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final boolean isWhitespace() {
        return this.a.isWhitespace();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int next() {
        return this.a.next();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextTag() {
        return this.a.nextTag();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String nextText() {
        return this.a.nextText();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final int nextToken() {
        return this.a.nextToken();
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void require(int i, String str, String str2) throws XmlPullParserException, IOException {
        this.a.require(i, str, str2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setFeature(String str, boolean z) throws XmlPullParserException {
        this.a.setFeature(str, z);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(InputStream inputStream, String str) throws XmlPullParserException {
        this.a.setInput(inputStream, str);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setProperty(String str, Object obj) throws XmlPullParserException {
        this.a.setProperty(str, obj);
    }

    @Override // android.util.AttributeSet
    public final boolean getAttributeBooleanValue(String str, String str2, boolean z) {
        return this.a.getAttributeBooleanValue(str, str2, z);
    }

    @Override // android.util.AttributeSet
    public final float getAttributeFloatValue(String str, String str2, float f) {
        return this.a.getAttributeFloatValue(str, str2, f);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeIntValue(String str, String str2, int i) {
        return this.a.getAttributeIntValue(str, str2, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeListValue(String str, String str2, String[] strArr, int i) {
        return this.a.getAttributeListValue(str, str2, strArr, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeResourceValue(String str, String str2, int i) {
        return this.a.getAttributeResourceValue(str, str2, i);
    }

    @Override // android.util.AttributeSet
    public final int getAttributeUnsignedIntValue(String str, String str2, int i) {
        return this.a.getAttributeUnsignedIntValue(str, str2, i);
    }

    @Override // org.xmlpull.v1.XmlPullParser, android.util.AttributeSet
    public final String getAttributeValue(String str, String str2) {
        return this.a.getAttributeValue(str, str2);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final String getNamespace(String str) {
        return this.a.getNamespace(str);
    }

    @Override // org.xmlpull.v1.XmlPullParser
    public final void setInput(Reader reader) throws XmlPullParserException {
        this.a.setInput(reader);
    }
}
