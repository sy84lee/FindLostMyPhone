package com.sy.publicapiviewer.item;

import com.tickaroo.tikxml.TikXmlConfig;
import com.tickaroo.tikxml.XmlReader;
import com.tickaroo.tikxml.XmlWriter;
import com.tickaroo.tikxml.typeadapter.ChildElementBinder;
import com.tickaroo.tikxml.typeadapter.TypeAdapter;
import java.io.IOException;
import java.lang.Override;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;

public class Item$$TypeAdapter implements TypeAdapter<Item> {
  private Map<String, ChildElementBinder<ValueHolder>> childElementBinders = new  HashMap<String, ChildElementBinder<ValueHolder>>();

  public Item$$TypeAdapter() {
    childElementBinders.put("fdSbjt", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.fdSbjt = reader.nextTextContent();
      }
    });
    childElementBinders.put("rnum", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.rnum = reader.nextTextContent();
      }
    });
    childElementBinders.put("atcId", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.atcId = reader.nextTextContent();
      }
    });
    childElementBinders.put("fdFilePathImg", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.fdFilePathImg = reader.nextTextContent();
      }
    });
    childElementBinders.put("fdSn", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.fdSn = reader.nextTextContent();
      }
    });
    childElementBinders.put("srno", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.srno = reader.nextTextContent();
      }
    });
    childElementBinders.put("depPlace", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.depPlace = reader.nextTextContent();
      }
    });
    childElementBinders.put("mdcd", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.mdcd = reader.nextTextContent();
      }
    });
    childElementBinders.put("prdtClNm", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.prdtClNm = reader.nextTextContent();
      }
    });
    childElementBinders.put("clrNm", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.clrNm = reader.nextTextContent();
      }
    });
    childElementBinders.put("fdYmd", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.fdYmd = reader.nextTextContent();
      }
    });
    childElementBinders.put("fdPrdtNm", new ChildElementBinder<ValueHolder>() {
      @Override
      public void fromXml(XmlReader reader, TikXmlConfig config, ValueHolder value) throws IOException {
        while(reader.hasAttribute()) {
          String attributeName = reader.nextAttributeName();
          if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
            throw new IOException("Unread attribute '"+ attributeName +"' at path "+ reader.getPath());
          }
          reader.skipAttributeValue();
        }
        value.fdPrdtNm = reader.nextTextContent();
      }
    });
  }

  @Override
  public Item fromXml(XmlReader reader, TikXmlConfig config) throws IOException {
    ValueHolder value = new ValueHolder();
    while(reader.hasAttribute()) {
      String attributeName = reader.nextAttributeName();
      if (config.exceptionOnUnreadXml() && !attributeName.startsWith("xmlns")) {
        throw new IOException("Could not map the xml attribute with the name '"+attributeName+"' at path "+reader.getPath()+" to java class. Have you annotated such a field in your java class to map this xml attribute? Otherwise you can turn this error message off with TikXml.Builder().exceptionOnUnreadXml(false).build().");
      }
      reader.skipAttributeValue();
    }
    while(true) {
      if (reader.hasElement()) {
        reader.beginElement();
        String elementName = reader.nextElementName();
        ChildElementBinder<ValueHolder> childElementBinder = childElementBinders.get(elementName);
        if (childElementBinder != null) {
          childElementBinder.fromXml(reader, config, value);
          reader.endElement();
        } else if (config.exceptionOnUnreadXml()) {
          throw new IOException("Could not map the xml element with the tag name <" + elementName + "> at path '" + reader.getPath()+"' to java class. Have you annotated such a field in your java class to map this xml attribute? Otherwise you can turn this error message off with TikXml.Builder().exceptionOnUnreadXml(false).build().");
        } else {
          reader.skipRemainingElement();
        }
      } else if (reader.hasTextContent()) {
        if (config.exceptionOnUnreadXml()) {
          throw new IOException("Could not map the xml element's text content at path '"+reader.getPath()+" to java class. Have you annotated such a field in your java class to map the xml element's text content? Otherwise you can turn this error message off with TikXml.Builder().exceptionOnUnreadXml(false).build().");
        }
        reader.skipTextContent();
      } else {
        break;
      }
    }
    return new Item(value.atcId, value.depPlace, value.fdFilePathImg, value.clrNm, value.fdPrdtNm, value.fdSbjt, value.fdSn, value.fdYmd, value.mdcd, value.prdtClNm, value.rnum, value.srno);
  }

  @Override
  public void toXml(XmlWriter writer, TikXmlConfig config, Item value, String overridingXmlElementTagName) throws IOException {
    if (value != null) {
      if (overridingXmlElementTagName == null) {
        writer.beginElement("item");
      } else {
        writer.beginElement(overridingXmlElementTagName);
      }
      if (value.getFdSbjt() != null) {
        writer.beginElement("fdSbjt");
        if (value.getFdSbjt() != null) {
          writer.textContent(value.getFdSbjt());
        }
        writer.endElement();
      }
      if (value.getRnum() != null) {
        writer.beginElement("rnum");
        if (value.getRnum() != null) {
          writer.textContent(value.getRnum());
        }
        writer.endElement();
      }
      if (value.getAtcId() != null) {
        writer.beginElement("atcId");
        if (value.getAtcId() != null) {
          writer.textContent(value.getAtcId());
        }
        writer.endElement();
      }
      if (value.getFdFilePathImg() != null) {
        writer.beginElement("fdFilePathImg");
        if (value.getFdFilePathImg() != null) {
          writer.textContent(value.getFdFilePathImg());
        }
        writer.endElement();
      }
      if (value.getFdSn() != null) {
        writer.beginElement("fdSn");
        if (value.getFdSn() != null) {
          writer.textContent(value.getFdSn());
        }
        writer.endElement();
      }
      if (value.getSrno() != null) {
        writer.beginElement("srno");
        if (value.getSrno() != null) {
          writer.textContent(value.getSrno());
        }
        writer.endElement();
      }
      if (value.getDepPlace() != null) {
        writer.beginElement("depPlace");
        if (value.getDepPlace() != null) {
          writer.textContent(value.getDepPlace());
        }
        writer.endElement();
      }
      if (value.getMdcd() != null) {
        writer.beginElement("mdcd");
        if (value.getMdcd() != null) {
          writer.textContent(value.getMdcd());
        }
        writer.endElement();
      }
      if (value.getPrdtClNm() != null) {
        writer.beginElement("prdtClNm");
        if (value.getPrdtClNm() != null) {
          writer.textContent(value.getPrdtClNm());
        }
        writer.endElement();
      }
      if (value.getClrNm() != null) {
        writer.beginElement("clrNm");
        if (value.getClrNm() != null) {
          writer.textContent(value.getClrNm());
        }
        writer.endElement();
      }
      if (value.getFdYmd() != null) {
        writer.beginElement("fdYmd");
        if (value.getFdYmd() != null) {
          writer.textContent(value.getFdYmd());
        }
        writer.endElement();
      }
      if (value.getFdPrdtNm() != null) {
        writer.beginElement("fdPrdtNm");
        if (value.getFdPrdtNm() != null) {
          writer.textContent(value.getFdPrdtNm());
        }
        writer.endElement();
      }
      writer.endElement();
    }
  }

  static class ValueHolder {
    String atcId;

    String depPlace;

    String fdFilePathImg;

    String clrNm;

    String fdPrdtNm;

    String fdSbjt;

    String fdSn;

    String fdYmd;

    String mdcd;

    String prdtClNm;

    String rnum;

    String srno;
  }
}
