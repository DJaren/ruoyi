import request from '@/utils/request'

// 查询楼层信息列表
export function listFloor(query) {
  return request({
    url: '/system/floor/list',
    method: 'get',
    params: query
  })
}

// 查询楼栋信息列表
export function listBuild(query) {
  return request({
    url: '/system/building',
    method: 'get',
    params: query
  })
}


// 查询楼层信息详细
export function getFloor(id) {
  return request({
    url: '/system/floor/' + id,
    method: 'get'
  })
}

// 新增楼层信息
export function addFloor(data) {
  return request({
    url: '/system/floor',
    method: 'post',
    data: data
  })
}

// 修改楼层信息
export function updateFloor(data) {
  return request({
    url: '/system/floor',
    method: 'put',
    data: data
  })
}

// 删除楼层信息
export function delFloor(id) {
  return request({
    url: '/system/floor/' + id,
    method: 'delete'
  })
}

// 导出楼层信息
export function exportFloor(query) {
  return request({
    url: '/system/floor/export',
    method: 'get',
    params: query
  })
}
