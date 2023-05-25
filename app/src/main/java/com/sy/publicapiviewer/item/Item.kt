package com.sy.publicapiviewer.item

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml
import java.io.Serializable

@Xml(name = "response")
data class ImageItem(
    @Element(name = "body")
    val body: Body,
    @Element(name="header")
    val header: Header
)

@Xml(name="header")
data class Header(
    @PropertyElement(name="resultCode")
    val resultCode: Int,
    @PropertyElement(name="resultMsg")
    val resultMsg: String
)

@Xml(name = "body")
data class Body(
    @Element(name="items")
    val items: Items,
    @PropertyElement(name="numOfRows")
    val numOfRows: Int,
    @PropertyElement(name="pageNo")
    val pageNo: Int,
    @PropertyElement(name="totalCount")
    val totalCount: Int
)

@Xml(name= "items")
data class Items(
    @Element(name="item")
    val item: List<Item>
)

@Xml(name= "item")
data class Item(
    @PropertyElement(name = "atcId")
    var atcId: String? = "none",
    @PropertyElement(name = "depPlace")
    var depPlace: String? = "none",
    @PropertyElement(name="fdFilePathImg")
    var fdFilePathImg: String = "none",
    @PropertyElement(name="clrNm")
    var clrNm: String? = "none",
    @PropertyElement(name="fdPrdtNm")
    var fdPrdtNm: String? = "none",
    @PropertyElement(name="fdSbjt")
    var fdSbjt: String? = "none",
    @PropertyElement(name="fdSn")
    var fdSn: String? = "none",
    @PropertyElement(name="fdYmd")
    var fdYmd: String? = "none",
    @PropertyElement(name="mdcd")
    var mdcd: String? = "none",
    @PropertyElement(name="prdtClNm")
    var prdtClNm: String? = "none",
    @PropertyElement(name = "rnum")
    var rnum: String? = "none",
    @PropertyElement(name = "srno")
    var srno: String? = "none",
)
